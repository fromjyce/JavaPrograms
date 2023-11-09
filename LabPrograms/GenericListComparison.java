/*generic function to see if 2 lists are same or not*/

import java.util.List;

public class GenericListComparison {
    public static <T> boolean areListsEqual(List<T> list1, List<T> list2) {
        // Check if both lists are null
        if (list1 == null && list2 == null) {
            return true;
        }

        // Check if only one of the lists is null
        if (list1 == null || list2 == null) {
            return false;
        }

        // Check if the lists have different sizes
        if (list1.size() != list2.size()) {
            return false;
        }

        // Compare each element of the lists
        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Test cases
        List<Integer> list1 = List.of(1, 2, 3);
        List<Integer> list2 = List.of(1, 2, 3);
        List<Integer> list3 = List.of(3, 2, 1);

        System.out.println("List 1 and List 2 are equal: " + areListsEqual(list1, list2));
        System.out.println("List 1 and List 3 are equal: " + areListsEqual(list1, list3));
    }
}
