/*
# Create a Trie
words[] = {"the", "a", "there", "their", "any", "thee"}

time complexity : O(L) -- Length of largest word
*/

public class Main {

  // intializing Nodes
  static class Node {
    Node children[] = new Node[26];
    boolean eow = false; // end of words

    Node() {
      for(int i=0; i<26; i++) {
        children[i] = null;
      }
    }
  }

  public static Node root = new Node();

  public static void main(String[] args) {
    String words[] = {"the", "a", "there", "their", "any", "thee"};
  }
}