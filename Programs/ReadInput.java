import java.util.Scanner;
public class ReadInput {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter a word: ");
        String word;
        word = scan.nextLine();
        System.out.println(num + word);
    }
}
