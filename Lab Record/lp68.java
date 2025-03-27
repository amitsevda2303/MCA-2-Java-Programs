// 68.	Create a program to handle number format exceptions
public class lp68 {
    public static void main(String[] args) {
        String str = "abc"; // Invalid numeric string

        try {
            int num = Integer.parseInt(str); // This will cause NumberFormatException
            System.out.println("Converted number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        }
    }
}
