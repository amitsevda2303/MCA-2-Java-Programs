// 92.	Create a program to demonstrate the use of Optional in Java 8.
import java.util.Optional;

public class lp92 {
    public static void main(String[] args) {
        // Creating an Optional with a non-null value
        Optional<String> optionalName = Optional.of("Amit");

        // Using ifPresent() to check and print value
        optionalName.ifPresent(name -> System.out.println("Name: " + name));

        // Creating an Optional that might be empty
        Optional<String> emptyOptional = Optional.empty();

        // Using orElse() to provide a default value
        String result = emptyOptional.orElse("Default Name");
        System.out.println("Result: " + result);

        // Using orElseGet() with a lambda to return a default value
        String value = emptyOptional.orElseGet(() -> "Generated Name");
        System.out.println("Generated Value: " + value);

        // Using orElseThrow() to throw an exception if value is missing
        try {
            emptyOptional.orElseThrow(() -> new IllegalArgumentException("No value present"));
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
