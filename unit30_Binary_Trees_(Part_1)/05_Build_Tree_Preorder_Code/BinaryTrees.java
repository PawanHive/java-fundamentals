/*
Build Tree Preorder

Time Complexity: O(n)
*/

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
    System.out.println(root.data);
  }
}
