import java.util.Scanner;

class Main
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		if (rows == 0) {
		    System.out.println("Zero");
		} else if (rows > 0 && rows <= 26) {
		    printPyramid(rows);
		} else if (rows < 0 && rows >= -26) {
		    printReversePyramid(-rows);
		} else {
		    System.out.println("Invalid Input");
		}
	}
	
	public static void printPyramid(int rows) {
	    for (int i=0; i<=rows; i++) {
	        for (int j=1; j <= rows - i; j++) {
	            System.out.print(" ");
	        }
	    
	    for (int k=1; k<=i; k++) {
	        char let = (char) ('A' + i - 1);
	        System.out.print(let + " ");
	    }
	    
	    System.out.println();
	    
	    }
	}
	
	public static void printReversePyramid(int rows) {
	    for (int i=rows; i>=1; i--) {
	        for (int j=1; j <= rows - i; j++) {
	            System.out.print(" ");
	        }
	    
	    for (int k=1; k<=i; k++) {
	        char let = (char) ('A' + i - 1);
	        System.out.print(let + " ");
	    }
	    
	    System.out.println();
	    
	    }
	}
}
