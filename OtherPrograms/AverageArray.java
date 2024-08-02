import java.util.Scanner;

class AverageArray
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] arr = new int[size];
		scan.nextLine();
		int sum = 0;
		if (size <= 0) {
		    System.out.println("Invalid ArRay Size");
		} 
		else {
		    for (int i=0; i<size; i++) {
		        arr[i] = scan.nextInt();
		    }
		    
		    for (int ar: arr) {
		        sum += ar;
		    }
		    
		    double avg = (double) sum / arr.length;
		    String f = String.format("%.6f", avg);
		    String s = f.substring(0, f.length() - 1);
		    System.out.println("Average of Given Array Elements is " + s + ".");
		}
	}
}