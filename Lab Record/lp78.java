// 78.	Create a program to implement a thread-safe counter.
class Counter {
    private int count = 0;

    synchronized void increment() { count++; } // Thread-safe increment

    synchronized int getCount() { return count; } // Get current count
}

public class lp78 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Create multiple threads that increment the counter
        Thread t1 = new Thread(() -> { for (int i = 0; i < 1000; i++) counter.increment(); });
        Thread t2 = new Thread(() -> { for (int i = 0; i < 1000; i++) counter.increment(); });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) { }

        System.out.println("Final Count: " + counter.getCount());
    }
}
