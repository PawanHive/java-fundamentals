/*
 * Iteration on HashSet
 *
 * a. using Iterators
 *
 * b. using Enhanced for loop
 */

import java.util.HashSet;
import java.util.Iterator;

public class Main {

  public static void main(String[] args) {
    HashSet<String> cities = new HashSet<>();

    cities.add("Delhi");
    cities.add("Mumbai");
    cities.add("Noida");
    cities.add("Bengaluru");

    // // Using Iterator
    // Iterator it = cities.iterator();
    // while(it.hasNext()) {
    //   System.out.println(it.next());
    // }

    // Using Advanced Loop
    for (String city : cities) {
      System.out.println(city);
    }
  }
}