import java.io.File;

public class lp59 {
    public static void main(String[] args) {
        File directory = new File("/Users/dell/desktop/java programs/MCA-2-Java-Lab-Programs/");
        if (directory.isDirectory()) {
            File[] filesList = directory.listFiles();
            if (filesList != null) {
                for (File file : filesList) {
                    System.out.println((file.isFile() ? "File: " : "Directory: ") + file.getName());
                }
            }
        }
    }
}