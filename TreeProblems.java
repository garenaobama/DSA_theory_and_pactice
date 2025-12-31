public class TreeProblems {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        // Construct a sample tree:
        // 4
        // / \
        // 2 7
        // / \
        // 1 3
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7));

        // Test Max Depth
        System.out.println("Max Depth: " + maxDepth(root)); // Expected: 3

        // Test Search
        System.out.println("Search 2 (Found): " + (searchBST(root, 2) != null));
        System.out.println("Search 5 (Missing): " + (searchBST(root, 5) != null));

        // Test Invert
        invertTree(root);
        System.out.println("Inverted Root val: " + root.val); // 4
        System.out.println("Inverted Left val: " + root.left.val); // 7 (Swapped)
    }

    /**
     * Problem 1: Maximum Depth of Binary Tree
     * Given the root of a binary tree, return its maximum depth.
     */
    public static int maxDepth(TreeNode root) {
        // TODO: Implement recursively
        return 0;
    }

    /**
     * Problem 2: Invert Binary Tree
     * Given the root of a binary tree, invert the tree, and return its root.
     */
    public static TreeNode invertTree(TreeNode root) {
        // TODO: Implement recursively
        return null;
    }

    /**
     * Problem 3: Search in a Binary Search Tree
     * Find the node in the BST that the node's value equals val and return the
     * subtree rooted with that node.
     * If such a node does not exist, return null.
     */
    public static TreeNode searchBST(TreeNode root, int val) {
        // TODO: Implement recursively (Leverage BST property!)
        return null;
    }
}
