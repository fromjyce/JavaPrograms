import java.util.Scanner;

class Main
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int end = scan.nextInt();
    
        if (start <=0 || end <= 0) {
            start = Math.abs(start);
            end = Math.abs(end);
        }
        
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        
        for (int i= start; i <= end; i++) {
            System.out.print(i + "*" + (i + 1));
            if (i != end) {
                System.out.print(", ");
            }
        }
        
        System.out.println();
        
        for (int i= start; i<=end; i++) {
            System.out.print(i * (i + 1));
            if (i != end) {
                System.out.print(", ");
            }
        }
        
    }
    
}
