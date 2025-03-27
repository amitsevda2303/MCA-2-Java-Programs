import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class lp53 {
    public static void main(String[] args) {
        String fileName = "output.txt";
        int wordCount = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            reader.close();
            System.out.println("Number of words in the file: " + wordCount);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
