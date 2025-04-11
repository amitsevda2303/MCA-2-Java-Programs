import java.util.ArrayList;

public class cp13 {
    public static void main(String[] args) {
        // Declare an ArrayList of integers
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);

        // Access and print elements
        System.out.println("First element: " + list.get(0));
        System.out.println("Second element: " + list.get(1));

        // Iterate through the ArrayList
        System.out.print("ArrayList elements: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Remove the last element
        list.remove(list.size() - 1);

        // Print the updated ArrayList
        System.out.println("After remove, ArrayList size is: " + list.size());

        // Clear all elements
        list.clear();
        System.out.println("After clear, ArrayList size is: " + list.size());
    }
}
