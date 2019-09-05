package wechat.mine;

public class ConvertBSTtoGreaterTree_538 {
    public TreeNode convertBST(TreeNode root) {
        if (root != null) dfs(root, 0);
        return root;
    }

    public int dfs(TreeNode node, int sum){
        if (node == null) return sum;

        sum = dfs(node.right, sum);

        int nodeVal = node.val;
        node.val = node.val + sum;
        sum = sum + nodeVal;
        sum = dfs(node.left, sum);

        return sum;
    }
}
