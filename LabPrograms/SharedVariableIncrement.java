/*Increment shared variables using threads */

public class SharedVariableIncrement {
    public static void main(String[] args) {
        SharedCounter counter = new SharedCounter();
        
        Thread thread1 = new IncrementThread(counter);
        Thread thread2 = new IncrementThread(counter);
        
        thread1.start();
        thread2.start();
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Final Count: " + counter.getCount());
    }
}

class SharedCounter {
    private int count = 0;
    
    public synchronized void increment() {
        count++;
    }
    
    public int getCount() {
        return count;
    }
}

class IncrementThread extends Thread {
    private SharedCounter counter;
    
    public IncrementThread(SharedCounter counter) {
        this.counter = counter;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.increment();
        }
    }
}
