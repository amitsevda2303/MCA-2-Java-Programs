// Write a Java program to check whether a string is a palindrome

class lp9 {
  public static void main(String[] args) {
    String str = "madam", rev = "";
    int length = str.length();
    for (int i = length - 1; i >= 0; i--)
      rev = rev + str.charAt(i);
    if (str.equals(rev))
      System.out.println(str + " is a palindrome");
    else
      System.out.println(str + " is not a palindrome");
  }
}