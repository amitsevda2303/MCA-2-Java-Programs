// 95.	Write a program to convert a JSON string to a Java object.
import com.fasterxml.jackson.databind.ObjectMapper;

// Step 1: Create a Java class matching JSON structure
class Person {
    public String name;
    public int age;
    
    // Default constructor needed for Jackson
    public Person() { }

    // toString() for printing
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class lp95 {
    public static void main(String[] args) {
        // Sample JSON string
        String json = "{ \"name\": \"Amit\", \"age\": 25 }";

        try {
            // Step 2: Convert JSON to Java object
            ObjectMapper objectMapper = new ObjectMapper();
            Person person = objectMapper.readValue(json, Person.class);

            // Step 3: Print the Java object
            System.out.println("Converted Java Object: " + person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
