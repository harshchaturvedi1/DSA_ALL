# Tree Data Structure in Java

## Overview

A tree is a non-linear data structure consisting of nodes connected by edges. Each node has a parent node and zero or more child nodes. Trees are widely used in computer science for representing hierarchical relationships between data.

## Basic Terminology

- **Node**: Each element in a tree.
- **Root**: The topmost node in a tree.
- **Parent**: A node from which other nodes are directly descended.
- **Child**: A node directly descended from another node.
- **Leaf**: A node with no children.
- **Edge**: The connection between two nodes.
- **Depth**: The level of a node in the tree, starting from the root.
- **Height**: The maximum depth of any node in the tree.

## Types of Trees

### Binary Tree

A binary tree is a tree data structure in which each node has at most two children, referred to as the left child and the right child.

### Binary Search Tree (BST)

A binary search tree is a binary tree in which the value of each node in the left subtree is less than or equal to the value of the node, and the value of each node in the right subtree is greater than the value of the node.

### Balanced Tree

A balanced tree is a tree in which the heights of the two subtrees of any node never differ by more than one.

## Operations on Trees

1. **Traversal**: Visiting all the nodes of a tree in a specific order.
2. **Insertion**: Adding a new node to the tree.
3. **Deletion**: Removing a node from the tree.
4. **Searching**: Finding a specific node in the tree.

## Implementation

Trees can be implemented using various data structures such as arrays, linked lists, or specialized tree structures.

### Example Code (Binary Search Tree in Java)

```java
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BinarySearchTree {
    TreeNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int key) {
        root = insertRecursive(root, key);
    }

    private TreeNode insertRecursive(TreeNode root, int key) {
        if (root == null) {
            root = new TreeNode(key);
            return root;
        }

        if (key < root.val) {
            root.left = insertRecursive(root.left, key);
        } else if (key > root.val) {
            root.right = insertRecursive(root.right, key);
        }

        return root;
    }
}
```

### Leaf Node

- A **leaf node**, also known as a _terminal node_, is a fundamental concept in tree data structures. It represents a node in a tree that does not have any children. In other words, it is a node that resides at the end of a branch in the tree and doesn't have any descendants.

- In a binary tree, a leaf node is a node that has no left or right child. In an n-ary tree, a leaf node is a node that has no child nodes.

- Leaf nodes are important because they signify the end of a path or branch within the tree. When traversing a tree, encountering a leaf node indicates that you've reached the end of a particular path or subtree.

- For example, in a file system represented as a tree structure, leaf nodes could represent individual files, while non-leaf nodes represent directories.

### Siblings

- In a tree data structure, **siblings** are nodes that share the same parent node. That is, they are nodes that are directly connected to the same parent node.

- For example, consider a binary tree where each node has at most two children. In this tree, if two nodes share the same parent node, they are considered siblings.

- Siblings are useful for understanding the hierarchical relationships within a tree. They provide context about nodes that are at the same level in the tree structure.

#### Example

A
/ \
B C
/
D E

- In this example, nodes B and C are siblings because they share the same parent node A. Similarly, nodes D and E are also siblings because they share the same parent node B.

### Level of a Node

In a tree data structure, the **level** of a node refers to its position in the hierarchy of the tree, measured from the root node. The root node is considered to be at level 0, and each subsequent level increases by one as you move away from the root.

Nodes at the same level are at the same distance from the root and have the same number of edges in the path leading from the root to the node.

#### Example

Consider the following binary tree:

````
    A        (Level 0)
   / \
   B  C      (Level 1)
  / \ / \
  D E F G     (Level 2)```


In this example:

- Node A is at level 0.
- Nodes B and C are at level 1.
- Nodes D, E, F, and G are at level 2.

````

## Maximum Number of Nodes at a Given Level in a Binary Tree

In a binary tree, the maximum number of nodes at a given level \( x \) can be calculated using the formula:

\[ {Max nodes at level } x = 2^x \]

This formula holds because at each level of a binary tree, the number of nodes doubles. At level 0 (the root level), there is 1 node. At level 1, there can be 2 nodes, at level 2, there can be 4 nodes, and so on.

For example, if you want to find the maximum number of nodes at level 3 in a binary tree, you would calculate:

\[ {Max nodes at level } 3 = 2^3 = 8 \]

So, at level 3, a binary tree can have a maximum of 8 nodes.

## Given a binary tree of n levels , how many nodes it can have

In a binary tree, the maximum number of nodes with \( n \) levels can be calculated using the formula:

\[ {Max nodes} = 2^n - 1 \]

## Rank of a Node in a Tree

In a tree, the **rank** of a node typically refers to its position relative to other nodes in a specific traversal order. The rank of a node can vary depending on the chosen traversal algorithm and the order in which nodes are visited.

### Example

Consider the following binary tree:

```
     A
   /   \
  B     C
 / \   / \
D   E F   G


- In a preorder traversal (root, left, right), the ranks of nodes would be as follows:

- Rank of node A: 1
- Rank of node B: 2
- Rank of node D: 3
- Rank of node E: 4
- Rank of node C: 5
- Rank of node F: 6
- Rank of node G: 7


```

# Tree Traversal Algorithms

Traversal in a tree refers to the process of visiting all the nodes of the tree in a specific order. There are several common traversal algorithms used to traverse trees:

## Depth-First Traversals

### Preorder Traversal

1. Visit the root node.
2. Recursively traverse the left subtree.
3. Recursively traverse the right subtree.

- root > left > right

### Inorder Traversal

1. Recursively traverse the left subtree.
2. Visit the root node.
3. Recursively traverse the right subtree.

- left > root > right

### Postorder Traversal

1. Recursively traverse the left subtree.
2. Recursively traverse the right subtree.
3. Visit the root node.

- left > right > root

## Breadth-First Traversal

### Level-Order Traversal

Visit all the nodes at the current level before moving to the next level. This traversal visits nodes level by level, starting from the root.
