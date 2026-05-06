 // Function to remove duplicate characters from string using recursion

public class Recursion {
  public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
    // base case
    if (idx == str.length()) {
      System.out.println(newStr); // print final result
      return;
    }

    // Get current character
    char currChar = str.charAt(idx);

     // Check if this character is already used (duplicate)
    if (map[currChar-'a'] == true) {
      // duplicate case: skip this character
      removeDuplicates(str, idx+1, newStr, map);
    } else {
      map[currChar-'a'] = true;  // mark character as visited
      removeDuplicates(str, idx+1, newStr.append(currChar), map); // add character to result and move forward
    }
  }
  public static void main(String[] args) {
    String str = "appnnacollege";
    removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
  }
}
