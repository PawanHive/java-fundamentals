/*
 * Majority Element
 *
 * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
 *
 * nums[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
 * // 1
 *
 * nums[] = {1, 2};
 * // 1, 2
 * 
 * Time complexity: O(n)
 */

import java.util.HashMap;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    int arr[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i=0; i<arr.length; i++) {
      // if(map.containsKey(arr[i])) {
      //   map.put(arr[i], map.get(arr[i]) + 1);
      // } else {
      //   map.put(arr[i], 1);
      // }

      // above 4 line can also written in one line
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);// if key exit then we will get frequency of it other wise we will get default value 0
    }

    // Set<Integer> keySet = map.keySet();
    // for (Integer key : keySet) {
    //   if(map.get(key) > arr.length / 3) {
    //     System.out.println(key);
    //   }
    // }

    // abvoe  4 line can also written line this
    for (Integer key : map.keySet()) {
      if(map.get(key) > arr.length/3) {
        System.out.println(key);
      }
    }

  }
}

// output: 1