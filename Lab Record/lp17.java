// Write a program to display all Armstrong numbers between 1 and 500

class lp17 {
  public static void main(String[] args) {
    for (int i = 1; i <= 500; i++) {
      int num = i;
      int sum = 0;
      while (num > 0) {
        int digit = num % 10;
        sum += digit * digit * digit;
        num /= 10;
      }
      if (sum == i) {
        System.out.print(i + ", ");
      }
    }
  }
}