// 70.	Create a program to use a custom exception to validate user input.
import java.util.Scanner;

class InvalidInputException extends Exception {
    InvalidInputException(String msg) { super(msg); }
}

public class lp70 {
    static void validateAge(int age) throws InvalidInputException {
        if (age < 18 || age > 100) throw new InvalidInputException("Age must be between 18 and 100.");
        System.out.println("Valid age entered.");
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your age: ");
            validateAge(scanner.nextInt());
        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Enter a number.");
        }
    }
}
