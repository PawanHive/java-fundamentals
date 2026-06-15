/*
 * Largest Subarray with 0 Sum
 *
 * arr = {15, -2, 2, -8, 1, 7, 10, 23}
 * ans = 5
 *
 * arr = {3, 4, 5}
 * ans = 0
 * 
 * time complexity : O(n)
 */

import java.util.HashMap;

public class Main {

  public static void main(String[] args) {
    int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};

    HashMap<Integer, Integer> map = new HashMap<>();
    // (sum, idx)

    int sum = 0;
    int len = 0;

    for (int j=0; j<arr.length; j++) {
      sum += arr[j];
      if(map.containsKey(sum)) {
        len = Math.max(len, j-map.get(sum));
      } else {
        map.put(sum, j);
      }
    }
    System.out.println("largest subarray with sum as 0 => " + len);
  }
}

// output: largest subarray with sum as 0 => 5