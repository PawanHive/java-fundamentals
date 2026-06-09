/*
Diameter of a Tree (Approach 1)

Time Complexity: O(n^2)
*/

public class BinaryTrees {
  static class Node {
    int data;
    Node left, right;

    public Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  // calculate height of tree
  public static int height(Node root) {
    // tree has no Node so it height = 0 
    if(root == null) {
      return 0;
    }

    int lh = height(root.left); // lh stands for left height
    int rh = height(root.right); // rh stands for right height
    return Math.max(lh, rh) + 1;
  }


  public static int diameter (Node root) {
    if(root == null) {
      return 0;
    }

    int leftDiam = diameter(root.left);
    int leftHt = height(root.left);
    int rightDiam = diameter(root.right);
    int rightHt = height(root.right);

    // selfDiameter: means which pass from the root Node
    int selfDiam = leftHt + rightHt + 1;

    return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
  }
  public static void main(String[] args) {
/*
 *        1
 *       / \
 *      2   3
 *     / \    \
 *    4   5    6
 */
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    // System.out.println(height(root)); // output: 3

    System.out.println(diameter(root)); // output: 5
  }
}