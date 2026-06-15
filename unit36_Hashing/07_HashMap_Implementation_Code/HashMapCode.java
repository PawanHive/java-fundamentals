// important for interview perspective

import java.util.*;

public class HashMapCode {

  // here K, V is generic, it can work for integer, string, etc
  static class HashMap<K, V> {
    private class Node {
      K key;
      V value;

      public Node(K key, V value) {
        this.key = key;
        this.value = value;
      }
    }
    private int n; // n --- total number of nodes or paired data
    private int N;
    private LinkedList<Node> buckets[]; // N = buckets.length -- like array, name of array is 'buckets'

    @SuppressWarnings("unchecked")
    public HashMap() {
      this.N = 4;
      this.buckets = new LinkedList[4];

      for(int i=0; i<4; i++) {
        this.buckets[i] = new LinkedList<>(); // empty linked list initialized to every 4 buckets
      }
    }

    private int hashFunction(K key) {
      int hc = key.hashCode(); // it can return positive or negative hashing
      return Math.abs(hc) % N; // this will convert it in +ve and then make then module so give value btwn 0 to 3
    }

    private int searchInLL(K key, int bi) {
      LinkedList<Node> ll = buckets[bi];
      int di = 0;

      for (int i=0; i<ll.size(); i++) {
        Node node = ll.get(i);
        if(node.key.equals(key)) {
          return di;
        }
        di++;
      }

      return -1;
    }

    // during rehash() size of bucket will change and Node will again take their respective place
    @SuppressWarnings("unchecked")
    private void rehash() {
      LinkedList<Node> oldBuck[] = buckets;
      buckets = new LinkedList[N*2];
      N = 2*N;
      for (int i=0; i<buckets.length; i++) {
        buckets[i] = new LinkedList<>();
      }

      // take Node and ---> add them in new bucket
      for (int i=0; i<oldBuck.length; i++) {
        LinkedList<Node> ll = oldBuck[i];
        for(int j=0; j<ll.size(); j++) {
          Node node = ll.get(j);
          put(node.key, node.value);
        }
      }
    }

    public void put (K key, V value){ // O(lambda) -- O(1)
      int bi = hashFunction(key); // return btwn 0 to 3  // assume func 'hashfunction' will give value of bucket index (bi) of 'key'
      int di = searchInLL(key, bi); // function 'searchInLL' will give us data index (di) - basiacally a index of Node / data pair... we can get two value , i) valid index or ii) -1 means that data not exit, so we will put() that data if not exist else we will update the value of it if already exits
  
      // node already exist then update it 
      if(di != -1) {
        Node node = buckets[bi].get(di); // find exact Node
        node.value = value; // update it
      } else {
        // create new Node
        buckets[bi].add(new Node (key, value));
        n++;
      }

      double lambda = (double)n/N;
      if(lambda > 2.0) {// if lambda is > than threshold value which is = to 2.0
        rehash();
      }
    }

    public boolean containsKey(K key) { // O(1)
      int bi = hashFunction(key); 
      int di = searchInLL(key, bi); 
  
      // node already exist then update it 
      if(di != -1) {
        return true;
      } else {
        return false;
      }
    }
    
    public V remove(K key) { // O(1)
      int bi = hashFunction(key);
      int di = searchInLL(key, bi); 
  
      // node already exist then update it 
      if(di != -1) {
        Node node = buckets[bi].remove(di); // find exact Node
        n--;
        return node.value;
      } else {
        return null;
      }
    }
    
    public V get(K key) { // O(1)
      int bi = hashFunction(key); 
      int di = searchInLL(key, bi); 
  
      // node already exist then update it 
      if(di != -1) {
        Node node = buckets[bi].get(di); // find exact Node
        return node.value;
      } else {
        // when getting -1
        return null;
      }
    }

    public ArrayList<K> keySet() {
      ArrayList<K> keys = new ArrayList<>();

      for (int i=0; i<buckets.length; i++) {
        LinkedList<Node> ll = buckets[i];
        for (Node node : ll) {
          keys.add(node.key);
        }
      }

      return keys;
    }

    public boolean isEmpty() {
      return n == 0;
    }
    
  }
  public static void main(String[] args) {
    HashMap<String, Integer> hm = new HashMap<>();
    
    hm.put("India", 100);
    hm.put("China", 150);
    hm.put("US", 50);
    hm.put("Nepal", 5);


    ArrayList<String> keys = hm.keySet();
    for(String key: keys) {
      System.out.println(key);
    }

    System.out.println(hm.get("India")); // output: 100
    System.out.println(hm.remove("India")); // output: 100
    System.out.println(hm.get("India")); // output: null
  }
}
