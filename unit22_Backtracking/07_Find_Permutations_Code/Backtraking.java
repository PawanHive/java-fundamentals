/*
# Find Permutations - means all possible combinations:
Find & print all permutations of a String: "abc" 
Output we want : abc, acb, bac, bca, cab, cba
*/

public class Backtraking {
  public static void findPermutation(String str, String ans) {
    // base case
    if(str.length() == 0) {
      System.out.println(ans);
      return;
    }

    // RECURSION
    for (int i=0; i<str.length(); i++) {
      char curr = str.charAt(i);
      String NewStr = str.substring(0, i) + str.substring(i+1);
      findPermutation(NewStr, ans+curr);
    }
  }
  public static void main(String[] args) {
    String str = "abc";
    findPermutation(str, "");
  }
}