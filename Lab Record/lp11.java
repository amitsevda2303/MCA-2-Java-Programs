// Write a program to print all prime numbers between 1 and 100

class lp11 {
  public static void main(String[] args) {
    outerLoop: for (int i = 1; i <= 100; i++) {
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          continue outerLoop;
        }
      }
      System.out.print(i + ", ");
    }
  }
}