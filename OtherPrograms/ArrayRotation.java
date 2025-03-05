
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[][] mat = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                mat[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < num/2; i++) {
            for (int j = i; j < num - i - 1; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[num - 1 - j][i];
                mat[num - 1 - j][i] = mat[num - 1 - i][num - 1 - j];
                mat[num - 1 - i][num - 1 - j] = mat[j][num - 1 - i];
                mat[j][num - 1 - i] = temp;
            }
        }

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
        scan.close();
    }
}
