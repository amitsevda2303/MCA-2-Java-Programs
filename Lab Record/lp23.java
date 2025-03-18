// Write a Java program to implement method overloading

class lp23 {
  void sum(int a, int b) {
    System.out.println(a + b);
  }

  void sum(int a, int b, int c) {
    System.out.println(a + b + c);
  }

  public static void main(String[] args) {
    lp23 obj = new lp23();
    obj.sum(10, 20);
    obj.sum(10, 20, 30);
  }
}