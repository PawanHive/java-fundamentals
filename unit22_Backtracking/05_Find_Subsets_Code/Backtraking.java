/*
Find Subsets:
Find & Print all subsets of a given string: "abc" 
Output we want: a, b, c, ab, bc, ac, abc, ""
*/

public class Backtraking {
  public static void findSubsets(String str, String ans, int i) {
    // base case
    if(i == str.length()) {
      if(ans.length() == 0) {
        System.out.println("null");
      } else { 
        System.out.println(ans); 
      }
      return;
    }

    // RECURSION
    // Yes choice
    findSubsets(str, ans+str.charAt(i), i+1);
    // No Choice
    findSubsets(str, ans, i+1);
  }
  public static void main(String[] args) {
    String str = "abc";
    findSubsets(str, "", 0);
  }
}