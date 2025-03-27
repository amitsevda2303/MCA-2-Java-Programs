// 93.	Write a program to implement the Singleton design pattern.
class Singleton {
    // Private static instance (Lazy Initialization)
    private static Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() { }

    // Public method to provide access to the instance
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton Instance Accessed!");
    }
}

public class lp93 {
    public static void main(String[] args) {
        // Getting the single instance of Singleton
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        // Calling a method on the Singleton instance
        obj1.showMessage();

        // Checking if both objects refer to the same instance
        System.out.println("Are obj1 and obj2 same? " + (obj1 == obj2));
    }
}
