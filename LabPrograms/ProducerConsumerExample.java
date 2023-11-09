/*producer consumer program using wait ().and notify () and synchronize */

import java.util.LinkedList;

public class ProducerConsumerExample {
    public static void main(String[] args) {
        final int CAPACITY = 5; // Buffer capacity

        LinkedList<Integer> buffer = new LinkedList<>();
        Object lock = new Object();

        Thread producerThread = new Thread(new Producer(buffer, CAPACITY, lock));
        Thread consumerThread = new Thread(new Consumer(buffer, CAPACITY, lock));

        producerThread.start();
        consumerThread.start();
    }
}

class Producer implements Runnable {
    private LinkedList<Integer> buffer;
    private int capacity;
    private Object lock;

    public Producer(LinkedList<Integer> buffer, int capacity, Object lock) {
        this.buffer = buffer;
        this.capacity = capacity;
        this.lock = lock;
    }

    public void run() {
        int value = 1;
        while (true) {
            synchronized (lock) {
                while (buffer.size() == capacity) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("Producing: " + value);
                buffer.add(value);
                value++;
                lock.notify();
            }
        }
    }
}

class Consumer implements Runnable {
    private LinkedList<Integer> buffer;
    private int capacity;
    private Object lock;

    public Consumer(LinkedList<Integer> buffer, int capacity, Object lock) {
        this.buffer = buffer;
        this.capacity = capacity;
        this.lock = lock;
    }

    public void run() {
        while (true) {
            synchronized (lock) {
                while (buffer.isEmpty()) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                int value = buffer.poll();
                System.out.println("Consuming: " + value);
                lock.notify();
            }
        }
    }
}
