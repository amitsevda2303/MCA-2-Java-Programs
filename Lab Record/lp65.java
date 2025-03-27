// 65.	Write a program to handle an array index out-of-bounds exception.
public class lp65 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30}; // Array of size 3

        try {
            System.out.println(arr[5]); // Accessing an out-of-bounds index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }
    }
}
