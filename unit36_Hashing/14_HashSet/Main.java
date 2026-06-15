/*
 * HashSet
 *
 * - no duplicates
 * - unordered
 * - NULL is allowed
 * 
 * 
 * HashSet Operations
 *
 * HashSet<Integer> hs = new HashSet<>();
 *
 * add(key)      -> O(1)
 * contains(key) -> O(1)
 * remove(key)   -> O(1)
 */


import java.util.HashSet;

public class Main {

  public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>();

    set.add(1);
    set.add(2);
    set.add(4);
    set.add(2);
    set.add(1);

    System.out.println(set); // output : [1, 2, 4]

    if (set.contains(2)) {
      System.out.println("set containts 2"); // output : set containts 2
    }

    // if(set.contains(3)) {
    // System.out.println("set contains 3");
    // }

    set.remove(2); // output : false

    System.out.println(set); // output : [1, 4]

    System.out.println(set.size()); // output : 2

    System.out.println(set.isEmpty()); // output : false
    
    set.clear(); // output : 
    
    System.out.println(set.size()); // output : 0
    
    System.out.println(set.isEmpty()); // output : true

  }
}