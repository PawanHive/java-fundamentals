/*
 * Subarray Sum Equal to K
 *
 * arr = {10, 2, -2, -20, 10}  K = -10
 *
 * ans = 3
 * -> (10, 2, -2, -20)
 * -> (2, -2, -20, 10)
 * -> (-20, 10)
 * 
 * time complexity : O(n)
 */

import java.util.HashMap;

public class Main {

  public static void main(String[] args) {
    int arr[] = {10, 2, -2, -20, 10};
    int k = -10;

    HashMap<Integer, Integer> map = new HashMap<>();
    //(sum, count)
    map.put(0, 1);

    int sum = 0;
    int ans = 0;

    for (int j=0; j<arr.length; j++) {
      sum += arr[j]; // sum(j)
      if(map.containsKey(sum-k)) {
        ans += map.get(sum-k);
      }
      map.put(sum, map.getOrDefault(sum, 0) + 1);
    }

    System.out.println(ans);
  }
}