package wechat.group;

public class RecoverBinarySearchTree_99 {
    public TreeNode t1,t2,pre;
    public void recoverTree(TreeNode root) {
        inorder(root);
        int tmp = t1.val;
        t1.val = t2.val;
        t2.val = tmp;
    }

    public void inorder(TreeNode root){
        if (root == null) return;
        inorder(root.left);
        if (pre != null && pre.val > root.val){
            if (t1 == null) t1 = pre;
            t2 = root;
        }
        pre = root;
        inorder(root.right);
    }
}
