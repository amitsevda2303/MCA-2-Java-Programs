// 74.	Create a program to implement inter-thread communication.
class SharedResource {
    private int value;
    private boolean available = false;

    synchronized void produce(int num) {
        while (available) {
            try { wait(); } catch (InterruptedException e) { }
        }
        value = num;
        available = true;
        System.out.println("Produced: " + num);
        notify();
    }

    synchronized void consume() {
        while (!available) {
            try { wait(); } catch (InterruptedException e) { }
        }
        System.out.println("Consumed: " + value);
        available = false;
        notify();
    }
}

public class lp74 {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        new Thread(() -> {
            for (int i = 1; i <= 5; i++) resource.produce(i);
        }).start();

        new Thread(() -> {
            for (int i = 1; i <= 5; i++) resource.consume();
        }).start();
    }
}
