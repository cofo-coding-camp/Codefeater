package wechat.mine;

public class SymmetricTreeNode {
    public boolean isSymmetric(TreeNode root) {
        return assist(root, root);
    }

    private boolean assist(TreeNode right, TreeNode left){
        if (right == null && left == null) return true;
        if (right == null || left == null) return false;
        return (right.val == left.val) && assist(right.right, left.left) && assist(right.left, left.right);
    }
}
