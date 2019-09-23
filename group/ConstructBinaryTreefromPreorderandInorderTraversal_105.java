package wechat.group;

import java.util.HashMap;

public class ConstructBinaryTreefromPreorderandInorderTraversal_105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++)  map.put(inorder[i], i);

        return helper(preorder, 0, preorder.length, inorder, 0, inorder.length, map);
    }

    //最大的想法是：将数组拆成2部分，然后再每个部分递归调用函数，完成数组的递归
    private TreeNode helper(int[] preorder, int p_start, int p_end, int[] inorder, int i_start, int i_end, HashMap<Integer, Integer> map){
        if (p_start == p_end) return null;
        int root_val = preorder[p_start];
        TreeNode root = new TreeNode(root_val);
        int i_root_index = map.get(root_val);
        int leftNum = i_root_index - i_start;
        root.left = helper(preorder, p_start + 1, p_start + leftNum + 1, inorder, i_start, i_root_index, map);
        root.right = helper(preorder, p_start + leftNum + 1, p_end, inorder, i_root_index + 1, i_end, map);
        return root;
    }
}
