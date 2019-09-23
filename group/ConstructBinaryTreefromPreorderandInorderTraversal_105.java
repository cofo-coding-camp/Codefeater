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

    }
}
