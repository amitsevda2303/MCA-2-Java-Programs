class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) { super(msg); }
}

public class lp63 {
    public static void main(String[] args) {
        try {
            int age = 15;
            if (age < 18) throw new InvalidAgeException("Age must be 18 or above.");
            System.out.println("Eligible to vote.");
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
