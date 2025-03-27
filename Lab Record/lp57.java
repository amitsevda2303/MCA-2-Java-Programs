import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class lp57 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("output.txt");
            FileWriter fileWriter = new FileWriter( "destination.txt");

            int character;
            while ((character = fileReader.read()) != -1) {
                fileWriter.write(character);
            }
            fileReader.close();
            fileWriter.close();

            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }
    }
}
