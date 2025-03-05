import java.util.*;

  
public class Photoshoot {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int i = 0; i < T; i++) {
            int n = scan.nextInt();
            scan.nextLine();
            String[] array = scan.nextLine().split(" ");
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(array[j]);
            }

            String mess = checker(arr);
            System.out.println(mess);
            scan.close();
        }
    }

    public static String checker(int[] nums) {
        int[] original = Arrays.copyOf(nums, nums.length);
        int[] ascending = Arrays.copyOf(nums, nums.length);
        Arrays.sort(ascending);
        Integer[] descending = Arrays.stream(ascending).boxed().toArray(Integer[]::new);
        Arrays.sort(descending, Collections.reverseOrder());
        if (Arrays.equals(original, ascending)) {
            return "L";
        } else if (Arrays.equals(original, Arrays.stream(descending).mapToInt(Integer::intValue).toArray())) {
            return "R";
        } else {
            return "N";
        }
    }
}