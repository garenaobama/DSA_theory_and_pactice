# Lesson 11: Introduction to Trees

## What is a Tree?
A **Tree** is a hierarchical data structure. Unlike Arrays or Linked Lists (which are linear), Trees have a parent-child relationship.
*   **Root**: The top-most node.
*   **Child**: A node directly connected to another node when moving away from the root.
*   **Leaf**: A node with no children.

## Binary Tree
A tree where each node has **at most two** children: `left` and `right`.
```java
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { this.val = val; }
}
```

## Binary Search Tree (BST)
A special type of Binary Tree where for every node:
1.  All values in the **Left Subtree** are **smaller**.
2.  All values in the **Right Subtree** are **larger**.
This allows for efficient searching (like Binary Search in an array).

## Traversals (Recursion in Action!)
We usually traverse trees using recursion (Depth First Search).
1.  **Pre-Order** (Root, Left, Right)
2.  **In-Order** (Left, Root, Right) -> Yields sorted values for BST!
3.  **Post-Order** (Left, Right, Root)

## Practice Problems

1.  **Maximum Depth of Binary Tree**: Find how deep the tree goes.
2.  **Invert Binary Tree**: Swap left and right children for every node (Famous interview question).
3.  **Search in a Binary Search Tree**: Find a target value in a BST efficiently.
