package BinaryTree;

public class TreeTraversal {
    // preOrder Traversal
    // RULE => (root) -> (leftSubtree) -> (rightSubtree)
    // TC = O(n)
    public void preOrder(TreNode root) {
        // base case
        if (root == null)
            return;

        // traversal (recursively)
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // inOrder Traversal
    // RULE => (leftSubtree) -> (root) -> (rightSubtree)
    // TC = O(n)
    public void inOrder(TreNode root) {
        // base case
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // postOrder Traversal
    // RULE => (leftSubtree) -> (rightSubtree) -> (root)
    // TC = O(n)
    public void postOrder(TreNode root) {
        // base case
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        TreeCreationTraversal t = new TreeCreationTraversal();
        TreNode root = t.BinaryTreeBuild(nodes);

        TreeTraversal tr = new TreeTraversal();
        tr.preOrder(root);
        System.out.println();
        tr.inOrder(root);
        System.out.println();
        tr.postOrder(root);
    }
}
