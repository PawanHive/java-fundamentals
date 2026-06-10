/*
// Valid BST
Approach 1: 
- compare with left and right node

Approach 2: 
- check if max value in left subtree < node
- and min value in right subtree > node


 *               8                <- Root
 *             /   \
 *            5     10
 *           / \      \
 *          3   6      11
 *         / \           \
 *        1   4           14
 */

import java.util.*;

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

  public static boolean isValidBST(Node root, Node min, Node max) {
    if(root == null) {
      return true;
    }

    if(min != null && root.data <= min.data) {
      return false;
    }

    else if(max != null && root.data >= max.data) {
      return false;
    }

    return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
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

    if(isValidBST(root, null, null)) {
      System.out.println("valid BST");
    } else {
      System.out.println("not valid BST");
    }
  }
}
