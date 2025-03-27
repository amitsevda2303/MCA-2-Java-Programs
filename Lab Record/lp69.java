// 69.	Write a program to demonstrate nested try-catch blocks
public class lp69 {
    public static void main(String[] args) {
        try {
            int arr[] = {10, 20, 30};
            try {
                int result = 10 / 0; // Causes ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Division by zero.");
            }
            System.out.println(arr[5]); // Causes ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Array index out of bounds.");
        }
    }
}
