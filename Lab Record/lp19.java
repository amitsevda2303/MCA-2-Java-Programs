// Write a program to calculate the power of a number using a loop

class lp19 {
  public static void main(String[] args) {
    int base = 2;
    int exponent = 3;
    int result = 1;
    for (int i = 1; i <= exponent; i++) {
      result *= base;
    }
    System.out.println(base + " raised to the power of " + exponent + " is " + result);
  }
}