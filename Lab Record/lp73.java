// 73.	Write a program to demonstrate thread synchronization
class SharedResource {
    synchronized void printNumbers(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try { Thread.sleep(500); } catch (InterruptedException e) { }
        }
    }
}

public class lp73 {
    public static void main(String[] args) {
        SharedResource obj = new SharedResource();

        new Thread(() -> obj.printNumbers(2)).start();
        new Thread(() -> obj.printNumbers(3)).start();
    }
}
