import java.util.Scanner;
public class ODMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int size = scan.nextInt();
        int a[] = new int[size];
        System.out.println("Enter the elements of the matrix: ");
        for(int i = 0 ; i< size; i ++ ) {
            System.out.print("Element " + (i+1) + " : ");
            a[i] = scan.nextInt();
        }
        System.out.println("Elements of the matrix are: ");
        for(int i = 0 ; i < size; i++) {
            System.out.println("Element " + (i+1) + " : " + a[i]);
        }
        scan.close();
    }
}
