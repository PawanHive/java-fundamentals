/*
 * Nearby Cars Problem
 *
 * We are given N points in a 2D plane which are locations of N cars.
 * If we are at the origin, print the nearest K cars.
 *
 * Example:
 *   C0 (3, 3)       K = 2
 *   C1 (5, -1)
 *   C2 (-2, 4)
 *
 *   ans = C0 & C2
 *
 * Distance Formula (from origin):
 *   dist = sqrt(x² + y²)
 *
 *   C0 → sqrt(3² + 3²) = sqrt(18) ≈ 4.24  ✅
 *   C1 → sqrt(5² + 1²) = sqrt(26) ≈ 5.09  ❌
 *   C2 → sqrt(2² + 4²) = sqrt(20) ≈ 4.47  ✅
 *
 *   K=2 nearest → C0 and C2
 */


import java.util.PriorityQueue;

public class Main {
  static class Point implements Comparable<Point> {
    int x; 
    int y;
    int distSq;
    int idx;

    public Point(int x, int y, int distSq, int idx) {
      this.x = x;
      this.y = y;
      this.distSq = distSq;
      this.idx = idx;
    }

    @Override
    public int compareTo(Point p2) {
      return this.distSq - p2.distSq;
    }
  }
  public static void main(String[] args) {
    // points
    int pts[][] = {
      {3, 3},
      {5, -1},
      {-2, 4}
    };
    int k = 2;

    PriorityQueue<Point> pq = new PriorityQueue<>();

    for(int i=0; i<pts.length; i++) {
      int distSq = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
      pq.add(new Point(pts[i][0], pts[i][1], distSq, i));
    }

    // nearest K cars
    for (int i=0; i<k; i++) {
      System.out.println("C" + pq.remove().idx);
    }
  }
}
