// Implement a program to count the number of vowels and consonants in a string

class lp14 {
  public static void main(String[] args) {
    String str = "Hello, World!";
    int vowels = 0, consonants = 0;
    for (char ch : str.toLowerCase().toCharArray()) {
      if (Character.isLetter(ch)) {
        if ("aeiou".indexOf(ch) != -1)
          vowels++;
        else
          consonants++;
      }
    }
    System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
  }
}
