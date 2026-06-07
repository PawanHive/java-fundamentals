/*
Minimum Absolute Difference Pairs

Given two arrays A and B of equal length n. Pair each element of array A to an element in array B, such that 
sum S of absolute difference of all the pairs in minimum.

A = [4, 1, 8, 7]
B = [2, 3, 6, 5]

ans = 6;

time complexity : O(n log n)
*/

import java.util.Arrays;

public class Greedy {
  public static void main(String[] args) {
    int A[] = {4, 1, 8, 7};
    int B[] = {2, 3, 6, 5};

    Arrays.sort(A);
    Arrays.sort(B);

    int minDiff = 0;

    for (int i=0; i<A.length; i++) {
      minDiff += Math.abs(A[i]-B[i]);
    }

    System.out.println("min absolute diff of pairs = " + minDiff);
  }
}

// output: min absolute diff of pairs = 6