/*
 * TreeSet
 *
 * - Sorted in ascending order
 * - NULL values are NOT allowed
 */

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class Main {

  public static void main(String[] args) {
    HashSet<String> cities = new HashSet<>();

    cities.add("Delhi");
    cities.add("Mumbai");
    cities.add("Noida");
    cities.add("Bengaluru");

    System.out.println(cities); // output : [Delhi, Bengaluru, Noida, Mumbai]


    // print in the same order it which order it was inserted
    LinkedHashSet<String> lhs = new LinkedHashSet<>();

    lhs.add("Delhi");
    lhs.add("Mumbai");
    lhs.add("Noida");
    lhs.add("Bengaluru");

    System.out.println(lhs); // output : [Delhi, Mumbai, Noida, Bengaluru]

    // print in ascending order
    TreeSet<String> ts = new TreeSet<>();

    ts.add("Delhi");
    ts.add("Mumbai");
    ts.add("Noida");
    ts.add("Bengaluru");

    System.out.println(ts); // output : [Bengaluru, Delhi, Mumbai, Noida]
  }
}