/*Combine Two Arrays Using a Generic Method */

import java.util.Arrays;

public class CombineArraysGeneric {
    public static <T> T[] CombineArraysGeneric(T[] arr1, T[] arr2) {
        T[] result = Arrays.copyOf(arr1, arr1.length + arr2.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        return result;
    }

    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3};
        Integer[] arr2 = {4, 5, 6};
        Integer[] combined = CombineArraysGeneric(arr1, arr2);
        for (Integer num : combined) {
            System.out.print(num + " ");
        }
    }
}
