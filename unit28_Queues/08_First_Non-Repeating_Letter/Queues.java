/*
First Non-Repeating Letter
First non-repeating Letter in a stream of characters.
intput: str = "aabccxb";
output we want: a -1 b b b b x 

time complexity: O(n)

*/

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
  public static void printNonRepeating(String str) {
    int freq[] = new int[26]; // 'a' - 'z'
    Queue<Character> q = new LinkedList<>();

    for (int i=0; i<str.length(); i++) {
      char ch = str.charAt(i);
      q.add(ch);
      freq[ch-'a']++; // freqency of character occurrence

      // if queue is not empty and frequency of character is greater than 1 time means that character is repeating to remove it
      while(!q.isEmpty() && freq[q.peek()-'a'] > 1) { 
        q.remove();
      }

      // if queue is empty
      if(q.isEmpty()) {
        System.out.print(-1 + " ");
      } else {
        System.out.print(q.peek() + " ");
      }
    }
    System.out.println();
  }
  public static void main(String[] args) {
    String str = "aabccxb";
    printNonRepeating(str); 
  }
}
