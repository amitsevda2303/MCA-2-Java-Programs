// Create a program to check if two strings are anagrams

class lp32 {
  public static void main(String[] args) {
    String str1 = "listen";
    String str2 = "silent";
    char[] c1 = str1.toCharArray();
    char[] c2 = str2.toCharArray();
    java.util.Arrays.sort(c1);
    java.util.Arrays.sort(c2);
    if (java.util.Arrays.equals(c1, c2)) {
      System.out.println("The strings are anagrams.");
    } else {
      System.out.println("The strings are not anagrams.");
    }
  }
}