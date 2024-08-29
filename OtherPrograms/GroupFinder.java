import java.util.*;

public class GroupFinder {

    private static final int[] rowDir = {-1, 1, 0, 0};
    private static final int[] colDir = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // number of rows
            int m = scanner.nextInt(); // number of columns

            int[][] grid = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    grid[i][j] = scanner.nextInt();
                }
            }

            boolean[][] visited = new boolean[n][m];
            int groupCount = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (grid[i][j] == 1 && !visited[i][j]) {
                        // Start a new DFS/BFS for this unvisited student
                        dfs(grid, visited, i, j, n, m);
                        groupCount++;
                    }
                }
            }

            System.out.println(groupCount);
        }

        scanner.close();
    }

    private static void dfs(int[][] grid, boolean[][] visited, int row, int col, int n, int m) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{row, col});
        visited[row][col] = true;

        while (!stack.isEmpty()) {
            int[] current = stack.pop();
            int r = current[0];
            int c = current[1];

            for (int d = 0; d < 4; d++) {
                int newRow = r + rowDir[d];
                int newCol = c + colDir[d];

                if (isValid(newRow, newCol, n, m) && grid[newRow][newCol] == 1 && !visited[newRow][newCol]) {
                    visited[newRow][newCol] = true;
                    stack.push(new int[]{newRow, newCol});
                }
            }
        }
    }

    private static boolean isValid(int row, int col, int n, int m) {
        return row >= 0 && row < n && col >= 0 && col < m;
    }
}
