// Create a program to check if a string contains only digits

class lp36 {
  public static void main(String[] args) {
    String str = "12345";
    if (str.matches("[0-9]+")) {
      System.out.println("The string contains only digits.");
    } else {
      System.out.println("The string does not contain only digits.");
    }
  }
}