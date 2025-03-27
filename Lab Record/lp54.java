import java.io.FileWriter;
import java.io.IOException;

public class lp54 {
    public static void main(String[] args) {
        String fileName = "output.txt";
        String content = "\nThis is the appended text.\n";

        try {
            FileWriter writer = new FileWriter(fileName, true);
            writer.write(content);
            writer.close();
            System.out.println("Text appended successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }
    }
}
