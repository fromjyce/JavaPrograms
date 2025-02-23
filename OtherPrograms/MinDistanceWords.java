import java.util.Arrays;
import java.util.List;

public class MinDistanceWords {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "this", "is", "a", "test", "hello", "again");
        String target1 = "hello";
        String target2 = "test";
        int distance = findDistance(words, target1, target2);
        
        if (distance != -1) {
            System.out.println("The distance between '" + target1 + "' and '" + target2 + "' is: " + distance);
        } else {
            System.out.println("The target words are not in the list or not found.");
        }
    }

    public static int findDistance(List<String> words, String target1, String target2) {
        int pos1 = -1, pos2 = -1;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).equals(target1)) {
                pos1 = i;
            } else if (words.get(i).equals(target2)) {
                pos2 = i;
            }

            if (pos1 != -1 && pos2 != -1) {
                minDistance = Math.min(minDistance, Math.abs(pos1 - pos2));
            }
        }

        return (minDistance == Integer.MAX_VALUE) ? -1 : minDistance;
    }
}
