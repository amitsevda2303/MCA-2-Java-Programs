// Create a program to implement multiple inheritance using interfaces

interface A {
  void display();
}

interface B {
  void display();
}

class lp25 implements A, B {
  public void display() {
    System.out.println("Display method from interface A");
  }

  public static void main(String[] args) {
    lp25 obj = new lp25();
    obj.display();
  }
}