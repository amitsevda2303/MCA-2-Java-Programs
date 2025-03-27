public class lp64 {
    public static void main(String[] args) {
        try {
            int arr[] = {10, 20, 30};
            int result = 10 / 0; // ArithmeticException
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
        } catch (Exception e) {
            System.out.println("Error: An unexpected exception occurred.");
        }
    }
}
