// 71.	Write a program to create a thread by extending the Thread class.
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class lp71 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread(); // Create thread object
        t1.start(); // Start the thread
    }
}
