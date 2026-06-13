/*
 * Connect N Ropes with Minimum Cost
 *
 * Given N ropes of different lengths, connect all ropes into one rope
 * with minimum cost.
 * Cost to connect two ropes = sum of their lengths.
 *
 * Example:
 *   ropes = {4, 3, 2, 6}
 *   ans   = 29
 *
 * Step-by-step (always connect 2 smallest):
 *
 *   Step 1 → connect 2 & 3  = 5   | cost =  5
 *   Step 2 → connect 5 & 4  = 9   | cost =  9
 *   Step 3 → connect 9 & 6  = 15  | cost = 15
 *                                  | total = 5 + 9 + 15 = 29 ✅
 *
 * Approach: Min-Heap use karo
 *   - Har baar 2 minimum elements nikalo
 *   - Unka sum = cost, wapas heap mein daalo
 *   - Repeat until 1 element bache
 *
 * TC: O(n log n)
 */

import java.util.PriorityQueue;

public class Main {
  public static void main(String[] args) {
    int ropes[] = {2, 3, 3, 4, 6};

    PriorityQueue<Integer> pq = new PriorityQueue<>();

    for (int i=0; i<ropes.length; i++) {
      pq.add(ropes[i]);
    }

    int cost = 0;
    while(pq.size() >1) {
      int min = pq.remove();
      int min2 = pq.remove();
      cost += min + min2;
      pq.add(min + min2);
    }
    System.out.println("cost of connecting n ropes = " + cost);
  }
}
