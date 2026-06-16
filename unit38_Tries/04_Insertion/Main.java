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

  // ---------------------------------------insert_in_tries-----------------------------------------------------
  public static void insert(String word) {
    Node curr = root;
    for(int level=0; level<word.length(); level++) {
      int idx = word.charAt(level) - 'a';
      if(curr.children[idx] == null) {
        curr.children[idx] = new Node();
      }
      curr = curr.children[idx];
    }
    curr.eow = true;
  }

  public static void main(String[] args) {
    String words[] = {"the", "a", "there", "their", "any", "thee"};

    for (int i=0; i<words.length; i++) {
      insert(words[i]);
    }
  }
}