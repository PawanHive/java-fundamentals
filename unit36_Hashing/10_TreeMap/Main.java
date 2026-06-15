// Tree Map
// - keys are sorted alphabetically
// - put, get, remove are O(logn)

// TreeMap<K, V> hm = new TreeMap<>();

// TreeMap use Red Black Trees Data structure
// BST (self-balancing trees)


import java.util.HashMap;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {

    // using TreeMap -- give output in alphabetical order
    TreeMap<String, Integer> tm = new TreeMap<>();
    tm.put("India", 100);
    tm.put("China", 150);
    tm.put("US", 50);
    tm.put("Indonesia", 5);

    System.out.println(tm);


    // ussing HashMap
    HashMap<String, Integer> hm = new HashMap<>();
    hm.put("India", 100);
    hm.put("China", 150);
    hm.put("US", 50);

    System.out.println(hm);
  }
}
