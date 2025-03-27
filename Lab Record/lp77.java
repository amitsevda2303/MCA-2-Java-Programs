// 77.	Write a program to demonstrate the wait() and notify() methods.
class Task {
    synchronized void printMessage() throws InterruptedException {
        System.out.println("Waiting for notification...");
        wait();  // Releases lock and waits
        System.out.println("Received notification! Resuming execution.");
    }

    synchronized void sendNotification() {
        System.out.println("Sending notification...");
        notify();  // Wakes up the waiting thread
    }
}

public class lp77 {
    public static void main(String[] args) {
        Task task = new Task();

        // Thread to wait
        new Thread(() -> {
            try { task.printMessage(); } catch (InterruptedException e) {}
        }).start();

        // Thread to notify after delay
        new Thread(() -> {
            try { Thread.sleep(2000); task.sendNotification(); } catch (InterruptedException e) {}
        }).start();
    }
}
