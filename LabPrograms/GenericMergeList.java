/*Write a Java program to create a generic method that takes two lists of the same type and merges them into a single list.  */
import java.util.*;

public class GenericMergeList {

    public static <T> List <T> MergeList(List<T> list1, List<T> list2) {
        List <T> mergedList = new ArrayList< >();
        int mergedListSize = Math.max(list1.size(), list2.size());
        for (int i = 0; i < mergedListSize; i++) {
            if (i < list1.size()) {
                mergedList.add(list1.get(i));
            }
            if (i < list2.size()) {
                mergedList.add(list2.get(i));
            }
        }
        return mergedList;
    }
    public static void main(String[] args) {
        List <Integer> list_one = List.of(1,2,3);
        List <Integer> list_two = List.of(4,5,6);
        System.out.println("Before Merging Lists: ");
        System.out.println(list_one);
        System.out.println(list_two);
        System.out.println("After Merging Lists: ");
        List <Integer> list_three;
        list_three = MergeList(list_one, list_two);
        System.out.println(list_three);
    }
}
