// Write a program to find the sum of digits of a given number

class lp15 {
  public static void main(String[] args) {
    int num = 12345;
    int sum = 0;
    while (num > 0) {
      sum += num % 10;
      num /= 10;
    }
    System.out.println("Sum of digits: " + sum);
  }
}