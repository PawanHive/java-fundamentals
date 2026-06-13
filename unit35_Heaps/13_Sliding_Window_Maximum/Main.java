/*
 * Sliding Window Maximum  [HARD]
 *
 * Maximum of all Subarrays of Size K
 *
 * arr = {1, 3, -1, -3, 5, 3, 6, 7},  K = 3
 *
 * Subarrays of size 3 and their maximums:
 *
 *   [1,  3, -1]  → max =  3
 *   [3, -1, -3]  → max =  3
 *   [-1, -3,  5] → max =  5
 *   [-3,  5,  3] → max =  5
 *   [5,  3,  6]  → max =  6
 *   [3,  6,  7]  → max =  7
 *
 *   ans = {3, 3, 5, 5, 6, 7}
 *
 * Approach 1 - Max-Heap (PriorityQueue):
 *   - Max-Heap mein {value, index} store karo
 *   - Har window ke liye → heap top = max
 *   - Stale elements (window ke bahar) index check karke ignore karo
 *   - TC: O(n log k)
 *
 * Approach 2 - Deque (Optimal):
 *   - Deque mein indexes store karo (decreasing order of values)
 *   - Har step pe front = current window ka max
 *   - TC: O(n)  ← Best approach
 */


import java.util.PriorityQueue;

public class Main {

  static class Pair implements Comparable<Pair> {
    int val;
    int idx;

    public Pair(int val, int idx) {
      this.val = val;
      this.idx = idx;
    }

    @Override
    public int compareTo(Pair p2) {
      // ascending
      // return this.val - p2.val;
      // descending
      return p2.val - this.val;
    }
  }
  public static void main(String[] args) {
    int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
    int k = 3; // window size
    int res[] = new int [arr.length-k+1]; // n-k+1;

    PriorityQueue<Pair> pq = new PriorityQueue<>();

    // 1st window
    for(int i=0; i<k; i++) {
      pq.add(new Pair(arr[i], i));
    }

    res[0] = pq.peek().val;

    for(int i=k; i<arr.length; i++) {
      while(pq.size() > 0 && pq.peek().idx <= (i-k)) {
        pq.remove();
      }

      pq.add(new Pair(arr[i], i));
      res[i-k+1] = pq.peek().val;
    }

    // print result
    for(int i=0; i<res.length; i++) {
      System.out.print(res[i] + " ");
    }
    System.out.println();
  }
}

// output :  3 3 5 5 6 7