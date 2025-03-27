import java.io.*;
import java.util.*;

public class lp60 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("non_existing_file.txt"))) {
            while (scanner.hasNextLine()) System.out.println(scanner.nextLine());
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}
