import java.util.Scanner;

public class TooManyCourses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int x = scanner.nextInt();
            int h = scanner.nextInt();
            
            int[] courseHours = new int[x];
            for (int i = 0; i < x; i++) {
                courseHours[i] = scanner.nextInt();
            }
            
            int maxFreeTime = h;
            boolean found = false;

            for (int i = 0; i < x; i++) {
                for (int j = i + 1; j < x; j++) {
                    int combinedTime = courseHours[i] + courseHours[j];
                    if (combinedTime <= h) {
                        maxFreeTime = Math.min(maxFreeTime, h - combinedTime);
                        found = true;
                    }
                }
            }

            if (!found) {
                maxFreeTime = h;
            }
            
            System.out.println(maxFreeTime);
        }
        
        scanner.close();
    }
}
