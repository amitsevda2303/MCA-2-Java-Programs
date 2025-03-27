// 67.	Write a program to demonstrate the use of throw and throws.
class CustomException extends Exception {
    CustomException(String message) { super(message); }
}

public class lp67 {
    static void checkAge(int age) throws CustomException {
        if (age < 18) throw new CustomException("Age must be 18 or above.");
        System.out.println("Access granted.");
    }

    public static void main(String[] args) {
        try {
            checkAge(15); // Change to 18+ to test success case
        } catch (CustomException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
