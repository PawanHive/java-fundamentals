/*
Search in BST

time complexity is  : O(H) -- height of a tree
*/

public class BST {

  static class Node {
    int data;
    Node left;
    Node right;

    Node (int data) {
      this.data = data;
    }
  }

  // -------------------------------------inser() build a BST -----------------------------------------------
  public static Node insert(Node root, int val) {
    if(root == null) {
      root = new Node(val);
      return root;
    }

    if(root.data > val) {
      // left subtree
      root.left = insert(root.left, val);
    } else {
      //right subtree
      root.right = insert(root.right, val);
    }
    return root;
  }

  // verify our BST is sorted or not
  public static void inorder(Node root) {
    if(root == null) {
      return;
    }
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
  }

  // ----------------------------------search() in BST----------------------------------------------------
  public static boolean search(Node root, int key)  {
    if (root == null) {
      return false;
    }

    if(root.data == key) {
      return true;
    }

    // search in left subtree
    if(root.data > key) {
      return search(root.left, key);
    } else {
      // search in right subtree
      return search(root.right, key);
    }
  }
  public static void main(String[] args) {

/*
*            5          <- Root
*           / \
*          1   7
*           \
*            3
*           / \
*          2   4
*/

    int values[] = {5, 1, 3, 4, 2, 7};
    Node root = null;


    for (int i = 0; i < values.length; i++) {
      root = insert(root, values[i]);
    }

    // key = 1 is present or not
    if(search(root, 1)) {
      System.out.println("found");
    } else {
      System.out.println("not found");
    }
  }
}
