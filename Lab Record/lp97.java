// 97.	Write a program to implement a generic method.
public class lp97 {
    
    // Generic method that prints an array of any type
    public static <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        // String array
        String[] strArray = {"Amit", "Sevda", "Java"};
        // Double array
        Double[] doubleArray = {1.1, 2.2, 3.3};

        // Calling generic method with different types
        System.out.print("Integer Array: ");
        printArray(intArray);

        System.out.print("String Array: ");
        printArray(strArray);

        System.out.print("Double Array: ");
        printArray(doubleArray);
    }
}
