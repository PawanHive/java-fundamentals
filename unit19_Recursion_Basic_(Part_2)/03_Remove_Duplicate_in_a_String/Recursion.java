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


/*
public class RemoveDuplicates {

    // Pass StringBuilder as parameter — single object shared across all calls
    static void removeDuplicates(String str, boolean[] visited, int idx, StringBuilder sb) {

        // Base case
        if (idx == str.length()) {
            return;
        }

        char ch = str.charAt(idx);
        int charIndex = ch - 'a';

        if (visited[charIndex]) {
            // Skip — just recurse forward
            removeDuplicates(str, visited, idx + 1, sb);
            return;
        }

        // Mark visited + append to StringBuilder
        visited[charIndex] = true;
        sb.append(ch);                                    // no new object created

        // Recurse for next character
        removeDuplicates(str, visited, idx + 1, sb);
    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        boolean[] visited = new boolean[26];
        StringBuilder sb = new StringBuilder();          // single object created once

        removeDuplicates(str, visited, 0, sb);

        System.out.println("Input  : " + str);
        System.out.println("Output : " + sb.toString());
    }
}
*/