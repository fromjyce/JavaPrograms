import java.util.Scanner;
public class PerimeterRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of length of the rectangle: ");
        int length = scan.nextInt();
        System.out.print("Enter the value of breadth of the rectangle: ");
        int breadth = scan.nextInt();
        System.out.println("Perimeter of Rectangle: " + 2*(length+breadth));
    }
    
}
