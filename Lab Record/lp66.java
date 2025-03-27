// 66.	Create a program to handle a null pointer exception.
public class lp66 {
    public static void main(String[] args) {
        String str = null; // Null reference

        try {
            System.out.println(str.length()); // This causes NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Error: Attempted to access a null object.");
        }
    }
}
