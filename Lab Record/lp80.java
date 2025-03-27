// 80.	Create a program to demonstrate the join() method in threads.
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class lp80 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable()); // Create thread object
        t1.start(); // Start the thread

        try {
            t1.join(); // Wait for the thread to finish
        } catch (InterruptedException e) { }

        System.out.println("Main thread is running...");
    }
}
// Output:
// Thread is running...
// Main thread is running...
// Explanation: In this program, we create a thread using the Runnable interface and start it. We then call the join() method on the thread t1, which causes the main thread to wait for t1 to finish before continuing. This ensures that the "Main thread is running..." message is printed after the "Thread is running..." message.