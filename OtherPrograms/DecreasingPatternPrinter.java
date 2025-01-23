import java.util.Scanner;

class Main
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        if (rows <= 0) {
            if (rows == 0) {
                System.out.println("InvaliD Input");
            } else {
                rows = Math.abs(rows);
            }
        }
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j< rows; j++) {
                if (j <= i) {
                    System.out.print(rows - j);
                }
                else {
                    System.out.print(rows - i);
                }
            }
            System.out.println();
        }
    }
}
