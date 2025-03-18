// Write a program to demonstrate the use of constructors

class lp21 {
  int a, b;
  lp21() {
    a = 20;
    b = 30;
  }
  void display() {
    System.out.println("a = " + a + " b = " + b);
  }
  public static void main(String[] args) {
    lp21 obj = new lp21();
    obj.display();
  }
}