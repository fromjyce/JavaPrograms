/*Write a Java program to create a generic method that takes a list of any type and returns it as a new list with the elements in reverse order. */

import java.util.*;

public class MergeListReverse {

    public static <T> List <T> MergeReverse (List<T> list_one, List<T> list_two) {
        List <T> MergeList = new ArrayList<>();
        int mergelength = Math.max(list_one.size(), list_two.size());
        for (int i = 0; i < mergelength; i++) {
            if (i<list_one.size()) MergeList.add(list_one.get(i));
            if (i<list_two.size()) MergeList.add(list_two.get(i));
        }
        Collections.reverse(MergeList);
        return MergeList;
    }

    public static void main(String[] args) {
        List <Integer> list_one = List.of(1,2,3,4);
        List <Integer> list_two = List.of(5,6,7);
        System.out.println("Before Merging: ");
        System.out.println(list_one);
        System.out.println(list_two);
        System.out.println("After Merging: ");
        List <Integer> ReverseList;
        ReverseList = MergeReverse(list_one, list_two);
        System.out.println(ReverseList);
    }
    
}
