/*Hello World -> World Hello */

import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();

        String[] arr = string.split(" ");

        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        scan.close();
    }
}
