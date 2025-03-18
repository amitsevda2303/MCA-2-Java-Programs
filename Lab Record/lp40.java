// Create a program to find all permutations of a given string

class lp40 {
  public static void main(String[] args) {
    permute("abc", 0, 2);
  }
  static void permute(String str, int l, int r) {
    if (l == r) System.out.println(str);
    else for (int i = l; i <= r; i++) permute(swap(str, l, i), l + 1, r);
  }
  static String swap(String str, int i, int j) {
    char[] c = str.toCharArray();
    char t = c[i]; c[i] = c[j]; c[j] = t;
    return new String(c);
  }
}
