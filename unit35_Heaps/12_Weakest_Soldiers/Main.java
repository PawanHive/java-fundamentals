/*
 * Weakest Soldier
 *
 * Given an m x n binary matrix of 1's (soldiers) and 0's (civilians).
 * Soldiers are positioned in front of civilians.
 * i.e., all 1's appear to the LEFT of all 0's in each row.
 *
 * Row i is WEAKER than row j if:
 *   - soldiers in row i  <  soldiers in row j
 *                     OR
 *   - both rows have same soldiers count AND i < j
 *
 * Find the K weakest rows.
 *
 * Example:
 *   m=4, n=4, k=2
 *
 *   Matrix:
 *   row0 → 1 0 0 0  → soldiers = 1  ✅ (weakest)
 *   row1 → 1 1 1 1  → soldiers = 4
 *   row2 → 1 0 0 0  → soldiers = 1  ✅ (same as row0, but i=2 > i=0)
 *   row3 → 1 0 0 0  → soldiers = 1
 *
 *   ans = row0 & row2
 *
 * Approach: Min-Heap use karo
 *   - Har row ka soldier count nikalo (Binary Search se → O(log n))
 *   - Min-Heap mein {soldierCount, rowIndex} store karo
 *   - K baar remove karo → K weakest rows mil jayenge
 *
 * TC: O(m log n + k log m)
 */

import java.util.PriorityQueue;

public class Main {
  static class Row implements Comparable<Row> {
    int soldiers;
    int idx;

    public Row(int soldiers, int idx) {
      this.soldiers = soldiers;
      this.idx = idx;
    }

    @Override
    public int compareTo(Row r2) {
      if(this.soldiers == r2.soldiers) {
        return this.idx - r2.idx; // sort on index basis
      }else {
        return this.soldiers - r2.soldiers; // else sort on soldiers basis
      }

    }
  }
  public static void main(String[] args) {
    int army[][] = {
      {1, 0, 0, 0},
      {1, 1, 1, 1},
      {1, 0, 0, 0},
      {1, 0, 0, 0},
    };

    int k = 2;

    PriorityQueue<Row> pq = new PriorityQueue<>();

    for(int i=0; i<army.length; i++) {
      int count = 0;
      for(int j=0; j<army[0].length; j++) {
        count += army[i][j] == 1 ? 1 : 0;
      }
      pq.add(new Row(count, i));
    }

    for (int i=0; i<k; i++) {
      System.out.println("R" + pq.remove().idx);
    }
  }
}
