public class lp61 {
    public static void main(String[] args) {
        int a = 10, b = 0; // Change 'b' to a non-zero value to test normal division

        try {
            int result = a / b; // This will cause ArithmeticException if b is 0
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
