// 96.	Create a program to demonstrate the use of annotations.
// Step 1: Creating a Custom Annotation
import java.lang.annotation.*;
import java.lang.reflect.Method;

// Step 1: Defining a custom annotation
@Retention(RetentionPolicy.RUNTIME) // Annotation available at runtime
@Target(ElementType.METHOD) // Can be applied to methods
@interface Info {
    String author();
    String date();
}

// Step 2: Using Built-in and Custom Annotations
class Example {
    
    @Deprecated // Built-in annotation (Warns that a method is outdated)
    public void oldMethod() {
        System.out.println("This is an old method.");
    }

    @Info(author = "Amit Sevda", date = "2025-03-26")
    public void newMethod() { // **Ensure it's public**
        System.out.println("This is a new method with custom annotation.");
    }
}

public class lp96 {
    public static void main(String[] args) throws Exception {
        Example obj = new Example();
        obj.oldMethod();  // Generates a warning but runs
        obj.newMethod(); 

        // Step 3: Retrieving Custom Annotation Info using Reflection
        Method method = Example.class.getMethod("newMethod"); // **Fixed**
        Info info = method.getAnnotation(Info.class);
        
        if (info != null) {
            System.out.println("Author: " + info.author() + ", Date: " + info.date());
        }
    }
}
