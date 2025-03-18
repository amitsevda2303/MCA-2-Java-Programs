// Write a program to find the frequency of characters in a string

class lp37 {
  public static void main(String[] args) {
    String str = "abccabbcbb";
    int[] freq = new int[256];
    for (char c : str.toCharArray())
      freq[c]++;
    for (int i = 0; i < 256; i++)
      if (freq[i] > 0)
        System.out.println("Frequency of " + (char) i + ": " + freq[i]);
  }
}