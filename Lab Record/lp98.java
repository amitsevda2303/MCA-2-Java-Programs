import java.util.*;

class Student {
    String name; int marks;
    public Student(String name, int marks) { this.name = name; this.marks = marks; }
    @Override public String toString() { return name + " - " + marks; }
}

public class lp98 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Amit", 85), new Student("Rahul", 92), 
            new Student("Sneha", 78), new Student("Priya", 88)
        );
        System.out.println("Before Sorting:\n" + students);
        students.sort(Comparator.comparingInt(s -> s.marks));
        System.out.println("\nAfter Sorting (by marks in ascending order):\n" + students);
    }
}
