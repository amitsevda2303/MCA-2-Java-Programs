// Write a Java program to implement an abstract class with abstract and non-abstract methods

abstract class lp28 {
  abstract void display();

  void show() {
    System.out.println("This is a non-abstract method");
  }

  public static void main(String[] args) {
    lp28 obj = new lp28() {
      void display() {
        System.out.println("This is an abstract method");
      }
    };
    obj.display();
    obj.show();
  }
}