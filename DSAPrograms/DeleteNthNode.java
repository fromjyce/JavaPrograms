package DSAPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DeleteNthNode {
    public static ArrayList<Integer> removeNthFromEnd(ArrayList<Integer> list, int n) {
        int size = list.size();
        int indexToRemove = size - n;
        
        if (indexToRemove >= 0 && indexToRemove < size) {
            list.remove(indexToRemove);
        }
        
        return list;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.stream(input.split("\\s+"))
              .mapToInt(Integer::parseInt)
              .forEach(list::add);
        int n = scanner.nextInt();
        list = removeNthFromEnd(list, n);
        
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
