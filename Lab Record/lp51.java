import java.io.FileWriter;
import java.io.IOException;

public class lp51 {
    public static void main(String[] args) {
        String fileName = "output.txt";
        String content = "Hello, this is a sample text";

        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(content);
            writer.close();

            System.out.println("File written successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
