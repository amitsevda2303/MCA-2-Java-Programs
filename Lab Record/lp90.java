// 90.	Create a program to demonstrate the use of Java 8 streams.
import java.util.*;
import java.util.stream.*;

public class lp90 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 8, 2, 7, 3, 15, 20);

        // 1️⃣ Filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);

        // 2️⃣ Square each number
        List<Integer> squaredNumbers = numbers.stream()
                                              .map(n -> n * n)
                                              .collect(Collectors.toList());
        System.out.println("Squared Numbers: " + squaredNumbers);

        // 3️⃣ Sort the numbers
        List<Integer> sortedNumbers = numbers.stream()
                                             .sorted()
                                             .collect(Collectors.toList());
        System.out.println("Sorted Numbers: " + sortedNumbers);

        // 4️⃣ Find sum of all numbers
        int sum = numbers.stream()
                         .reduce(0, Integer::sum);
        System.out.println("Sum of Numbers: " + sum);

        // 5️⃣ Find the maximum number
        int max = numbers.stream()
                         .max(Integer::compare)
                         .orElse(-1);
        System.out.println("Max Number: " + max);
    }
}
