import java.util.Scanner;

class Main
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        if (rows <= 4) {
            System.out.println("GiVen Value is Not More Than 4");
        }
        for (int i =0; i<=rows; i++) {
            for (int j= 1; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
