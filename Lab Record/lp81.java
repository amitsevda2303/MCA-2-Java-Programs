// 81.	Write a program to implement a binary search.
import java.util.Scanner;

public class lp81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements in sorted order:");
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        System.out.print("Enter the element to search: ");
        int key = scanner.nextInt();

        int low = 0, high = n - 1, mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("Element found at index " + mid);
                break;
            } else if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }

        if (low > high) System.out.println("Element not found.");

        scanner.close();
    }
}
// Output:
// Enter the number of elements: 5
// Enter the elements in sorted order:
// 10 20 30 40 50
// Enter the element to search: 30