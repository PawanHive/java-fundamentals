/*
Level Order Traversal
using (Queue and Iteration)


Time Complexity: O(n)
*/

import java.util.*;

public class BinaryTrees {
  // this call -- defines a node
  static class Node {
    int data;
    Node left;
    Node right;

    // constructor
    Node (int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  // this class -- contains tree operations
  static class BinaryTree {
    static int idx = -1;
    public static Node buildTree(int nodes[]) { // it will return Node
      idx++;

      if(nodes[idx] == -1) {
        return null;
      }

      // create new Node
      Node newNode = new Node(nodes[idx]);
      newNode.left = buildTree(nodes); // this is recursive function
      newNode.right = buildTree(nodes); // this is also recursive function

      return newNode;
    }

    // -------------------------------preorder traversal -- TC: O(n)---------------------------------------------
    /* rule: 
      - root
      - left Subtree
      - right Subtree
    */
    public static void preorder(Node root) {
      if(root == null) {
        // System.out.print(-1 + " "); // without this output will be: 1 2 4 5 3 6   ..... // without this -1 = null node will not print while traverse
        return;
      }
      System.out.print(root.data + " ");
      preorder(root.left);
      preorder(root.right);
    }

    // ---------------------------------------inorder traversal -- TC: O(n)---------------------------------
    /* rule: 
      - left Subtree
      - root
      - right Subtree
    */
    public static void inorder(Node root) {
      if(root == null) {
        return;
      }
      inorder(root.left);
      System.out.print(root.data + " ");
      inorder(root.right);
    }

    // -------------------------------------Postorder traversal -- TC: O(n)------------------------------------------------
    /* rule: 
      - left Subtree
      - right Subtree
      - root
    */
    public static void postorder(Node root) {
      if(root == null) {
        return;
      }
      postorder(root.left);
      postorder(root.right);
      System.out.print(root.data + " ");
    }
    
    // ---------------------------------------Level Order Traversal-----------------------------------------
    public static void levelOrder(Node root) {
      if(root == null) {
        return;
      }

      Queue<Node> q = new LinkedList<>();
      q.add(root);
      q.add(null); // it will help to create next line

      while (!q.isEmpty()) {
        Node currNode = q.remove();
        if(currNode == null) {
          System.out.println();
          if(q.isEmpty()) {
            break;
          } else {
            q.add(null);
          }
        } else {
          System.out.print(currNode.data + " ");
          if(currNode.left != null) {
            q.add(currNode.left);
          }
          if(currNode.right != null) {
            q.add(currNode.right);
          }
        }
      }
    }
  }

  public static void main(String[] args) {
/*
 *        1
 *       / \
 *      2   3
 *     / \    \
 *    4   5    6
 */
    int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
    BinaryTree tree = new BinaryTree();// create BinaryTree object
    Node root = tree.buildTree(nodes);
    System.out.println(root.data); // output: 1

    // tree.preorder(root); // output: 1 2 4 5 3 6    OR     // output: 1 2 4 -1 -1 5 -1 -1 3 -1 6 -1 -1 

    // tree.inorder(root); // output: 4 2 5 1 3 6 

    // tree.postorder(root); // output: 4 5 2 6 3 1 

    tree.levelOrder(root);
    /*
    output: 
    1 
    2 3 
    4 5 6 
    */
  }
}
