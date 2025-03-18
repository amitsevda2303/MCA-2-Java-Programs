// Create a class to represent a Student with properties like name, roll number, and marks. Write methods to display student details

class Student {
  String name;
  int rollNumber, marks;

  Student(String n, int r, int m) {
    name = n;
    rollNumber = r;
    marks = m;
  }

  void display() {
    System.out.println("Name: " + name);
    System.out.println("Roll Number: " + rollNumber);
    System.out.println("Marks: " + marks);
  }

  public static void main(String[] args) {
    Student obj = new Student("Krishna", 1, 100);
    obj.display();
  }
}