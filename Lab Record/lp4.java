// Write a program to calculate the factorial of a number using recursion

class lp4 {

  static int fact(int n) {
    return n == 1 ? 1 : n * fact(n - 1);
  }

  public static void main(String[] args) {
    int n = 5;
    System.out.println("Factorial of " + n + " is " + fact(n));
  }

}