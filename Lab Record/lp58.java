import java.io.*;

public class lp58 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String largest = "", line;
            while ((line = reader.readLine()) != null)
                for (String word : line.split("[ ,.?!;:-]"))
                    if (word.length() > largest.length()) largest = word;
            System.out.println("Largest word: " + largest);
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
