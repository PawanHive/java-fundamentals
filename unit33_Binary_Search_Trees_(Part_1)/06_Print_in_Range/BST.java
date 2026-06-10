/*
/*
 *  Print in Range
    k1 = 5 , and k2 = 12
 *
 *               8                <- Root
 *             /   \
 *            5     10
 *           / \      \
 *          3   6      11
 *         / \           \
 *        1   4           14
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

  // -------------------------------------insert() build a BST -----------------------------------------------
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

  // ----------------------------------------print in Range-------------------------------------------------- 
  public static void printInRange(Node root, int k1, int k2) {
    // nothing will print
    if(root == null) {
      return;
    }
    
    // when root is greater than k1 and less than k2
    if(root.data >= k1 && root.data <= k2) {
      printInRange(root.left, k1, k2);
      System.out.print(root.data + " ");
      printInRange(root.right, k1, k2);
    }

    // when data lie in left subtree
    else if(root.data < k1) {
      printInRange(root.left, k1, k2);
    }
    else {
      // when data lie in right subtree
      printInRange(root.right, k1, k2);
    }
  }
  public static void main(String[] args) {

/*
 *               8                <- Root
 *             /   \
 *            5     10
 *           / \      \
 *          3   6      11
 *         / \           \
 *        1   4           14
 */

    int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
    Node root = null;


    for (int i = 0; i < values.length; i++) {
      root = insert(root, values[i]);
    }


    inorder(root);
    System.out.println();

    printInRange(root, 5  , 12);
  }
}
