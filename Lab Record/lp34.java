// Create a program to reverse each word in a string

class lp34 {
  public static void main(String[] args) {
    String str = "Hello World";
    String[] words = str.split(" ");
    String ans = "";
    for (String word : words)
      ans += new String(new StringBuilder(word).reverse()) + " ";
    System.out.println("Reversed words: " + ans.trim());
  }
}