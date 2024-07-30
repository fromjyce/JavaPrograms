/*Write a program to print the trapezium pattern 
 * Input Format: Input consists of one integer that represents the number of rows
 * Output Format: Output Prints the pattern
 * 
 * Test Case: 1:
 * Input: 4
 * Output: 1*2*3*4*17*18*19*20
           --5*6*7*14*15*16
           ----8*9*12*13
           ------10*11
*/

import java.util.Scanner;

public class TrapeziumPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        
        int leftStart = 1;
        int rightStart = rows * rows + 1;

        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print("--");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(leftStart++ + "*");
            }

            
            for (int j = 0; j < i - 1; j++) {
                System.out.print(rightStart++ + "*");
            }

            System.out.print(rightStart + "\n");
            rightStart = rightStart - (i-1) * 2;
        }

    }
}