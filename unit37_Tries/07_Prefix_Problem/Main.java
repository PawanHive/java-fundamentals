/*
# Prefix Problem

Find shortest unique prefix for every word in a given list.
Assume no word is prefix of another.

arr[] = {"zebra", "dog", "duck", "dove"};
ans = {"z", "dog", "du", "dov"};

time complexity : O(L) -- levels in my trie = longest word

asked in Google, MIcrosoft, Amazon
*/


public class Main {
  static class Node {
    Node[] children = new Node[26];
    boolean eow = false;
    int freq;

    public Node() {
      for(int i=0; i<children.length; i++) {
        children[i] = null;
      }
      freq = 1;
    }
  }

  public static Node root = new Node();

  // insert
  public static void insert(String word) {
    Node curr = root; 
    for (int i=0; i<word.length(); i++) {
      int idx = word.charAt(i) - 'a';
      if(curr.children[idx] == null) {
        curr.children[idx] = new Node();
      } else {
        curr.children[idx].freq++;
      }
      curr = curr.children[idx];
    }
    curr.eow = true;
  }

  // find prefix
  public static void findPrefix(Node root, String ans) {
    // base case
    if(root == null) {
      return;
    }

    // base case
    if(root.freq == 1) {
      System.out.println(ans);
      return;
    }

    for (int i=0; i<root.children.length; i++) {
      if(root.children[i] != null) {
        findPrefix(root.children[i], ans + (char)(i+'a')); // recursive func
      }
    }
  }


  public static void main(String[] args) {
    String arr[] = {"zebra", "dog", "duck", "dove"};

    for(int i=0; i<arr.length; i++) {
      insert(arr[i]);
    }

    root.freq = -1;

    findPrefix(root, "");
  }
}