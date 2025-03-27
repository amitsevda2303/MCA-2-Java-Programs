// 75.	Write a program to demonstrate thread priorities.
class MyThread extends Thread {
    MyThread(String name) { super(name); }

    public void run() {
        System.out.println(getName() + " running with priority " + getPriority());
    }
}

public class lp75 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Low Priority");
        MyThread t2 = new MyThread("Medium Priority");
        MyThread t3 = new MyThread("High Priority");

        t1.setPriority(Thread.MIN_PRIORITY);  // Priority 1
        t2.setPriority(Thread.NORM_PRIORITY); // Priority 5
        t3.setPriority(Thread.MAX_PRIORITY);  // Priority 10

        t1.start();
        t2.start();
        t3.start();
    }
}
