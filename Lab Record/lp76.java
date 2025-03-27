// 76.	Create a program to implement a producer-consumer problem.
class Buffer {
    private int value = -1; // Stores a single item
    private boolean available = false; // Checks if item exists

    synchronized void produce(int num) throws InterruptedException {
        while (available) wait(); // Wait if full
        value = num;
        available = true;
        System.out.println("Produced: " + num);
        notify(); // Notify consumer
    }

    synchronized void consume() throws InterruptedException {
        while (!available) wait(); // Wait if empty
        System.out.println("Consumed: " + value);
        available = false;
        notify(); // Notify producer
    }
}

public class lp76 { 
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        new Thread(() -> { try { for (int i = 1; i <= 5; i++) buffer.produce(i); } catch (InterruptedException e) {} }).start();
        new Thread(() -> { try { for (int i = 1; i <= 5; i++) buffer.consume(); } catch (InterruptedException e) {} }).start();
    }
}
