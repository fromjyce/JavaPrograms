/*0,2,8,14,24,34, 48 */


import java.util.Scanner;

public class GeometricSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int end = scan.nextInt();
        for (int i = 1; i < end; i++) {
            if (i % 2 == 0) {
                System.out.println((i * i) - 2);
            }
            else {
                System.out.println((i * i) - 1);
            }
        }
        }
    }
