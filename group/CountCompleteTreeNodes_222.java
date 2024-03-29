package wechat.group;

public class CountCompleteTreeNodes_222 {
    public int countNodes(TreeNode root) {
        int res = cns (root);
        return res;
    }

    public int cns(TreeNode root){
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        if (root.left == null) return  1 + cns(root.right);
        if (root.right == null) return  1 + cns(root.left);
        int leftCnt = cns(root.left);
        int rightCnt = cns(root.right);
        return  1 + leftCnt + rightCnt;
    }
}
