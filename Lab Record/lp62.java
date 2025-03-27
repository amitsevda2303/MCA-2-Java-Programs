public class lp62 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will cause an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("This is the finally block, which always executes.");
        }
    }
}
