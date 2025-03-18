// Create a program to swap two numbers without using a third variable

class lp10 {
  public static void main(String[] args) {
    int num1 = 10, num2 = 20;
    System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);
    num1 = num1 + num2;
    num2 = num1 - num2;
    num1 = num1 - num2;
    System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
  }
}