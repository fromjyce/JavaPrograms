/*Develop a static inner class called pack which has the min and max methods to find the min and max element of an array */
import java.util.*;

class FindMinMax {
    static class pack {
        int maxvalue(int[] arr) {
            Arrays.sort(arr);
            return arr[arr.length-1];
        }
        int minvalue(int[] arr) {
            Arrays.sort(arr);
            return arr[0];
        }
    }
}

public class StaticMinAndMax {
    public static void main(String[] args) {
        FindMinMax.pack findminmax = new FindMinMax.pack();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int arrsize = scan.nextInt();
        int[] arr = new int[arrsize];
        System.out.println("Enter the Elements of the Array: ");
        for(int i = 0; i < arrsize; i++) {
            System.out.print("Element " + (i+1) + " : ");
            arr[i] = scan.nextInt();
        }
        System.out.print("Elements of the Array: ");
        for(int i = 0; i < arrsize; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("Do you want to find \n1. Maximum Element \n2. Minimum Element \n3. Exit \nEnter your choice: ");
        int choice = scan.nextInt();
        switch(choice) {
            case 1:
                System.out.print("Maximum Element: " + findminmax.maxvalue(arr));
                break;
            case 2:
                System.out.print("Maximum Element: " + findminmax.minvalue(arr));
                break;
            case 3:
                System.exit(0);
            default:
                System.out.print("Enter Valid Number");
        }
        scan.close();
    }
}
