package wechat.mine;

public class SumRoottoLeafNumbers_129 {
    public int sumNumbers(TreeNode root) {

        int ans = assist(root, 0);
        return ans;
    }

    public int assist(TreeNode root, int res){
        if (root == null) return 0;

        res = 10 * res + root.val;

        if (root.left == null && root.right ==  null) return res;

        return assist(root.left, res) + assist(root.right, res);

    }
}
