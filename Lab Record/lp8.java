// Write a program to find the GCD of two numbers

class lp8 {
  public static void main(String[] args) {
    int num1 = 150, num2 = 200;
    while (num1 != num2) {
      if (num1 > num2)
        num1 -= num2;
      else
        num2 -= num1;
    }
    System.out.println("GCD: " + num1);
  }
}