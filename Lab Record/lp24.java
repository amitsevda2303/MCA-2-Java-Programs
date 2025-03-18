// Demonstrate method overriding with an example

class base {
  void display() {
    System.out.println("Base class");
  }
}

class lp24 extends base {
  void display() {
    System.out.println("Derived class");
  }

  public static void main(String[] args) {
    lp24 obj = new lp24();
    obj.display();
  }
}