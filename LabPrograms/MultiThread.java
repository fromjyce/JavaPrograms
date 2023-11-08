/*
Create a multithreaded program by creating a subclass of Thread and then creating, initializing, and starting two Thread objects from your class. The threads will execute concurrently and display Today is hot, humid, and sunny.
 */

class MyThreadOne extends Thread {
    @Override
    public void run() {
        System.out.println("Today");
        System.out.println("hot,");
        System.out.println("and");
    }
}

class MyThreadTwo extends Thread {
    @Override
    public void run() {
        System.out.println("is");
        System.out.println("humid,");
        System.out.println("sunny.");
    }
}

public class MultiThread {
    public static void main(String[] args) {
        // Create two thread objects
        MyThreadOne thread1 = new MyThreadOne();
        MyThreadTwo thread2 = new MyThreadTwo();

        // Start the threads
        thread2.start();
        thread1.start();
        
    }
}
