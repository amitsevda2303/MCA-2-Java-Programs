// Create a program to remove duplicate characters from a string

class lp38 {
  public static void main(String[] args) {
    String str = "abccadbbcbbe";
    String ans = "";
    for (char c : str.toCharArray())
      if (ans.indexOf(c) == -1)
        ans += c;
    System.out.println("String after removing duplicates: " + ans);
  }
}