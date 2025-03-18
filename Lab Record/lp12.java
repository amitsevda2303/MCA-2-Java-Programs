// Create a program to check if a year is a leap year

class lp12 {
  public static void main(String[] args) {
    int year = 2020;
    boolean leap = false;
    if (year % 4 == 0) {
      if (year % 100 == 0) {
        if (year % 400 == 0) {
          leap = true;
        }
      } else {
        leap = true;
      }
    }
    System.out.println(year + (leap ? " is a leap year" : " is not a leap year"));
  }
}