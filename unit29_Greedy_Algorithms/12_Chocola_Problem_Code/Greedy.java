/*
# Chocola Problem

We are given a bar of chocolate composed of mxn square pieces. One should break the chocolate
into single squares. Each break of a part of the chocolate is charged a cost expressed by a positive
integer. This cost does not depend on the size of the part that is being broken but only depends on
the line the break goes along. Let us denote the costs of breaking along consecutive vertical lines
with x1, x2, ..., xm-1 and along horizontal lines with y1, y2, ..., yn-1.
Compute the minimal cost of breaking the whole chocolate into single squares.
*/

import java.util.*;

public class Greedy {
  public static void main(String[] args) {
    int n = 4, m = 6;
    Integer costVer[] = {2, 1, 3, 1, 4}; // m-1
    Integer costHor[] = {4, 1, 2}; // n-1

    // sorting in descending order
    Arrays.sort(costVer, Collections.reverseOrder());
    Arrays.sort(costHor, Collections.reverseOrder());

    int h = 0, v = 0; // kounsa horizontal or vertical cut lagene wale hain
    int hp = 1, vp = 1; // this will count of horizontal piece and vertical piece
    int cost = 0;

    while(h < costHor.length && v < costVer.length) {
      // vertical cost < horizontal cost

      // horizontal cut
      if(costVer[v] <= costHor[h]) {
        cost += (costHor[h] * vp);
        hp++;
        h++;
      } else {
        cost += (costVer[v] * hp);
        vp++;
        v++;
      }
    }
    while (h < costHor.length) {
      cost += (costHor[h] * vp);
      hp++;
      h++;
    }

    while(v < costVer.length) {
      cost += (costVer[v] * hp);
      vp++;
      v++;
    }

    System.out.println("min cost of cuts = " + cost);
  }
}
