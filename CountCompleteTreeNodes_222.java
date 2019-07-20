package leetcode.lesson_9_wechat;

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
        int lefsCnt = cns(root.left);
        int righCnt = cns(root.right);
        return  lefsCnt + righCnt;
    }
}
