import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Given an integer matrix of size n*n. n is the number of rows and columns. Traverse it in a spiral form.

Sample Input 0

3

123

456

789

Sample Output 0

123698745

Sample Input 1

4

1234

5678

9 10 11 12

13 14 15 16

Sample Output 1

1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 */

public class SpiralMatrixTraverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[][] mat = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                mat[i][j] = scan.nextInt();
            }
        }

        List<Integer> result = new ArrayList<>();
        int t = 0, b = num - 1, l = 0, r = num - 1;
        int dir = 0;

        while (t <= b && l <= r) {
            if (dir == 0) { 
                for (int i = l; i <= r; i++) {
                    result.add(mat[t][i]);
                }
                t++;
                
            } else if (dir == 1) { 
                for (int i = t; i <= b; i++) {
                    result.add(mat[i][r]);
                }
                r--;
                
            } else if (dir == 2) { 
                for (int i = r; i >= l; i--) {
                    result.add(mat[b][i]);
                }
                b--;
                
            } else if (dir == 3) {
                for (int i = b; i >= t; i--) {
                    result.add(mat[i][l]);
                }
                l++;
                
            }
            
            dir = (dir + 1) % 4;
            System.out.println(result + " " + dir);
        }

        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}