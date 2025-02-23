import java.util.Scanner;

class Main
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        if (num1 < 0) {
            System.out.println("Invalid First Input");
        } else if (num2 < 0) {
            System.out.println("Invalid Second Input");
        } else if (num3 < 0) {
            System.out.println("InvaliD ThirD Input");
        } else if (num1 <=0 || num2<=0 || num3<=0){
        System.out.println("Sorry Invalid Inputs!");
        } else {
            int res = lcmThree(num1, num2, num3);
        System.out.println(res);
        }
        
    }
    
    public static int lcmThree(int a, int b, int c) {
        return lcm(lcm(a,b),c);
    }
    
    public static int lcm (int a, int b) {
        return (a*b)/gcd(a,b);
    }
    
    public static int gcd(int a, int b) {
        if (b==0) {
            return a;
        }
        return gcd(b, a%b);
    }
}
