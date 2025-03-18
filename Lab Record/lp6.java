// Write a Java program to check if a number is prime

class lp6 {
  public static void main(String[] args) {
    int num = 29;
    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        System.out.println(num + " is not a prime number");
        return;
      }
    }
    System.out.println(num + " is a prime number");
  }
}