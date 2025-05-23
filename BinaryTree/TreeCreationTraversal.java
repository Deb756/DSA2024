package BinaryTree;

public class TreeCreationTraversal {
    // creating a Binary tree from a array of preorder (Using Recursion)
    public static int idx = -1;

    // Build a tree
    public  TreNode BinaryTreeBuild(int nodes[]) {
        idx++;
        // base case
        if (nodes[idx] == -1)
            return null;

        TreNode newNode = new TreNode(nodes[idx]);
        // left subtree
        newNode.left = BinaryTreeBuild(nodes);
        // right subtree
        newNode.right = BinaryTreeBuild(nodes);

        return newNode;
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        TreeCreationTraversal t = new TreeCreationTraversal();
        TreNode root =  t.BinaryTreeBuild(nodes);
        System.out.println(root.data); // 1 (bcz its the root of the tree)
    }
}
