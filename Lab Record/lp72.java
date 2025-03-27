// 72.	Create a program to implement a thread using the Runnable interface.
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class lp72 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable()); // Create thread object
        t1.start(); // Start the thread
    }
}
