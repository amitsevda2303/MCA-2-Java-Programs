import java.io.File;

public class lp55 {
    public static void main(String[] args) {
        String fileName = "output.txt";
        File file = new File(fileName);

        if (file.exists()) {
            System.out.println("File exists: " + fileName);
        } else {
            System.out.println("File does not exist: " + fileName);
        }
    }
}
