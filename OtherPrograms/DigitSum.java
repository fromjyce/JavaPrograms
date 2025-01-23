import java.util.Scanner;

class Main
{
    public static void main(String []args)
    {
       Scanner scan = new Scanner(System.in);
       int num = scan.nextInt();
       if(num <=0){
           System.out.println("Invalid Input");
       }
        else {
            int sum = 0;
            while (num > 0) {
                int dig = num % 10;
                sum+= dig;
                num /= 10;
            }
            System.out.println(sum);
        }
    }
}
