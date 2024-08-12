
import java.util.Scanner;

public class DiagonalTraverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.nextLine();
        int[][] mat = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                mat[i][j] = scan.nextInt();
            }
        }
        
        int n = mat.length;
        int m = mat[0].length;

        // Traverse the upper half diagonals (including the middle diagonal)
        for (int d = 0; d < n; d++) {
            int row = d;
            int col = 0;
            while (row >= 0 && col < m) {
                System.out.print(mat[row][col]);
                row--;
                col++;
            }
        }

        // Traverse the lower half diagonals
        for (int d = 1; d < m; d++) {
            int row = n - 1;
            int col = d;
            while (row >= 0 && col < m) {
                System.out.print(mat[row][col]);
                row--;
                col++;
            }
        }
    }
}
