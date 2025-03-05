import java.util.Scanner;

class Main
{
    
    public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            } 
            for (int i=2; i*i<=num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
        
        
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        int low = scan.nextInt();
        int high = scan.nextInt();
        if (low < 0 || high < 0) {
            System.out.println("Invalid Inputs");
        }
        else {
            int count = 0;
            StringBuilder res = new StringBuilder();
            for (int n = low; n <= high; n++) {
                if (isPrime(n)) {
                    if (count % 2 == 0) {
                        res.append(n).append(", ");
                    }
                    count++;
                }
            }
            if (res.length() > 0) {
                res.setLength(res.length()-2);
            }
            System.out.println(res);
        }
        scan.close();
    }
}
