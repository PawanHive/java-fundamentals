```java
/*
 * Which is a Heap?
 *
 * Tree 1 (Max-Heap):        Tree 2 (Min-Heap):
 *
 *          10                           1
 *         /  \                         /  \
 *        6    5                       2    4
 *       / \                          / \
 *      1   2                        5   10
 *
 */
```

# Remember these things about Heap

## Binary Tree
- at most 2 children

## Complete Binary Tree
- CBT (complete binary tree) is a BT (binary tree) in which all the levels are completely filled except possible the last one, which is filled from the lef to right

## Heap Order Propert:
`Chidren >= Parent(minHeap)`
`Children <= Parent(maxHeap)`