# Delete a Node 

## Cases

### Case 1: `No child (Leaf Node)`
- Delete Node
- & Return Null to parent

### Case 2: One Child
- Delete Node
- & Replace with child Node

### Case 3: Two Children
- Replace value with inorder successor
- Delete the node for inorder successor

*inorder successor always has 0 or 1 child*

Inorder successor in BST ---> left most node in right Subtree

