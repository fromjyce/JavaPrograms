import java.util.Arrays;

class CheckRemoveEven {
    public static int[] removeEven(int[] arr) {
        return Arrays.stream(arr)
                .filter(num -> num % 2 != 0)
                .toArray();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 10, 6, 3};
        int[] result = removeEven(arr);

        // Printing the result array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
