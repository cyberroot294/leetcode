public class maximumDepthOfBinaryTree {

    public static void main(String[] args) {
        //       3
        //     /  \
        //    9   20
        //       /  \
        //      15  7 
        TreeNode root = new TreeNode(3); // 3 is value of root node;
        TreeNode left1 = new TreeNode(9); // 3 is value of root node;
        TreeNode right1 = new TreeNode(20); // 3 is value of root node;
        TreeNode left2 = new TreeNode(15); // 3 is value of root node;
        TreeNode right2 = new TreeNode(7); // 3 is value of root node;
        root.left = left1;
        root.right = right1;
        root.right.left = left2;
        root.right.right = right2;

        // The result should be 3

        int result = recursiveMaxDepth(root);
        System.out.println(result);

    }

    private static int recursiveMaxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + Math.max(recursiveMaxDepth(root.left), recursiveMaxDepth(root.right));
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}