/*
# Max Length Chain of Pairs

You are given n pairs of numbers. In very pair, the first number is always smaller than the second number. 
A pair (c, d) can come after pair (a, b) if b<c.
Find the longest chain which can be formed from a given set of pairs.

pairs = 
(5, 24)
(39, 60)
(5, 28)
(27, 40)
(50, 90)

ans = 3;

time complexiy: o(n log n)
*/

import java.util.Arrays;
import java.util.Comparator;

public class Greedy {
  public static void main(String[] args) {
    int pairs[][] = {
      {5, 24}, 
      {39, 60}, 
      {5, 28}, 
      {27, 40}, 
      {50, 90}
    };

    // sorting the pair (based on second number)
    Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

    int chainLen = 1;
    int chainEnd = pairs[0][1]; // last selected pair end // chain end

    for (int i=1; i<pairs.length; i++) {
      if(pairs[i][0] > chainEnd) {
        chainLen++; // increaseing chain length
        chainEnd = pairs[i][1]; // increasing chain end
      }
    }
    System.out.println("max length of chain = " + chainLen);
  }
}
