/*Jaffer wanted to excel in Math. He was learning about the Kaprekar number from Meena, his Maths teacher. She gave him a few random numbers and asked him to find out whether they are Kaprekar number or not.

(Consider an n-digit number k. Square it and add the right n digits to the left nor n-1 digits. If the resultant sum is k, then k is called a Kaprekar number. For example, 9 is a Kaprekar number since 9^2= 81&8+1=9, similarly, 297 is a Kaprekar number as 297*2=88209 & 88+209-297).

Can you help laffer to write a program to find whether the given number is a Kaprekar number or not?

45

Sample Input 0

Sample Output 0

Kaprekar Number

Sample Input 1

23

Sample Output 1

Not a Kaprekar Number */

import java.util.Scanner;

public class KaprekarChecker {

    public static int count( int num) {
        String strNum = String.valueOf(num);
        return strNum.length();
    }
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String strn = String.valueOf(num);
        int lennum = count(num);
        int snum = num * num ;
        String strs = String.valueOf(snum);
        int slennum = count(snum);

        String r = strs.substring(slennum - lennum);
        String l = strs.substring(0, slennum - lennum);

        int right = Integer.parseInt(r);
        int left = (l.isEmpty()) ? 0 : Integer.parseInt(l);

        if (right + left == num) {
            System.out.println("Kaprekar Number");
        }
        else {
            System.out.println("Not a Kaprekar Number");
        }
        sc.close();
    }
}
