// Demonstrate the use of final variables, methods, and classes

class lp29 {
  final int x = 10;
  final void display() {
    System.out.println("Value of x: " + x);
  }
  public static void main(String[] args) {
    lp29 obj = new lp29();
    obj.display();
  }
}