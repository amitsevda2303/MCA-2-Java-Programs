import java.util.*;
class GenericCalculator {
    // Generic method with an upper bound
    public static <T extends Number> double calculateSum(T[] numbers) {
        double sum = 0.0;
        for (T num : numbers) {
            sum += num.doubleValue();
        }
        return sum;
    }
}
public class cp12 {

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Sum of integers: " + GenericCalculator.calculateSum(intArray));

        Double[] doubleArray = {1.1, 2.2, 3.3};
        System.out.println("Sum of doubles: " + GenericCalculator.calculateSum(doubleArray));
    }
}