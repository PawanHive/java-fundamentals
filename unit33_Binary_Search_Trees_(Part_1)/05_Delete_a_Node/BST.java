/*
/*
 *  Delete a Node - Cases:
 *  1. No child (Leaf Node)
 *  2. One child
 *  3. Two Children
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

  // ----------------------------------delete() in BST----------------------------------------------------
  public static Node delete(Node root, int val) {
    if(root.data < val) {
      root.right = delete(root.right, val);
    } else if(root.data > val) {
      root.left = delete(root.left, val);
    }
    else {
      // voila
      // case 1 -- leaf Node
      if(root.left == null && root.right == null) {
        return null;
      }
      
      // case 2 -- single child
      if(root.left == null) {
        return root.right;
      }
      else if (root.right == null) {
        return root.left;
      }
      
      // case 3 -- both children
      Node IS = findInorderSuccessor(root.right);
      root.data = IS.data;
      root.right = delete(root.right, IS.data);
    }
    return root;
  }

  // find Inorder Successor
  public static Node findInorderSuccessor(Node root) {
    while(root.left != null) {
      root = root.left;
    }
    return root;
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

    // delete val = 5
    root = delete(root, 5);
    System.out.println();

    inorder(root);
  }
}
