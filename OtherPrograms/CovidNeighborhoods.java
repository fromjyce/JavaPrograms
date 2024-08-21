import java.util.Scanner;

public class CovidNeighborhoods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); 

        for (int i = 0; i < t; i++) {
            int m = scanner.nextInt(); 
            int n = scanner.nextInt();
            int[][] map = new int[m][n];

            for (int row = 0; row < m; row++) {
                for (int col = 0; col < n; col++) {
                    map[row][col] = scanner.nextInt();
                }
            }

            System.out.println(findLargestNeighborhood(map, m, n));
        }

        scanner.close();
    }

    public static int findLargestNeighborhood(int[][] map, int m, int n) {
        boolean[][] visited = new boolean[m][n];
        int largestSize = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    int size = dfs(map, visited, i, j, m, n);
                    largestSize = Math.max(largestSize, size);
                }
            }
        }

        return largestSize;
    }

    public static int dfs(int[][] map, boolean[][] visited, int i, int j, int m, int n) {
        if (i < 0 || i >= m || j < 0 || j >= n || map[i][j] == 0 || visited[i][j]) {
            return 0;
        }

        visited[i][j] = true;
        int size = 1;

        
        size += dfs(map, visited, i - 1, j, m, n);
        size += dfs(map, visited, i + 1, j, m, n);
        size += dfs(map, visited, i, j - 1, m, n);
        size += dfs(map, visited, i, j + 1, m, n);

        return size;
    }
}
