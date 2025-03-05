import java.util.Scanner;

class Main
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        int diff = scan.nextInt();
        int n = scan.nextInt();
        if (n <=0 ){
            System.out.println("Invalid Input.");
        }
        else {
            for(int i =0; i < n; i++) {
                int term = first + (i * diff);
                if (i == n - 1) {
                    System.out.print(term + ".");
                } else {
                    System.out.print(term + ", ");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}
