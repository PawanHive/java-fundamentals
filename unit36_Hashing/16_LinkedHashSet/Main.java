/*
Linked HashSet

Ordered using Doubly Linked List
*/

import java.util.HashSet;
import java.util.LinkedHashSet;


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

    lhs.remove("Delhi");
    System.out.println(lhs); // output : [Mumbai, Noida, Bengaluru]


  }
}