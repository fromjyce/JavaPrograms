/*Write an application that executes two threads. One Thread displays "Hi" every 1000 milliseconds and the other displays "Welcome" every 3000 milliseconds.  Create the threads by extending the Thread class */

public class TimeThreadExample {
    public static void main(String[] args) {
        HiThread hiThread = new HiThread();
        WelcomeThread welcomeThread = new WelcomeThread();

        hiThread.start();
        welcomeThread.start();
    }
}

class HiThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Hi");
            try {
                Thread.sleep(1000); // Sleep for 1000 milliseconds (1 second)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class WelcomeThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Welcome");
            try {
                Thread.sleep(3000); // Sleep for 3000 milliseconds (3 seconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

