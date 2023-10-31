/*Print 1 to 20 with Two Threads (Odd and Even) */

public class OddEvenThread {
    public static void main(String[] args) {
        Thread oddThread = new Thread(() -> {
            for (int i = 1; i <= 20; i += 2) {
                System.out.println("Odd: " + i);
            }
        });

        Thread evenThread = new Thread(() -> {
            for (int i = 2; i <= 20; i += 2) {
                System.out.println("Even: " + i);
            }
        });

        oddThread.start();
        evenThread.start();
    }
}
