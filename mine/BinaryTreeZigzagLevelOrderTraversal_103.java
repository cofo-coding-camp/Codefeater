package wechat.mine;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal_103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        //记录是否有翻转
        boolean isReverse = false;
        while (!queue.isEmpty()){
            LinkedList<Integer> aux = new LinkedList<>();
            int count = queue.size();
            for (int i = 0; i < count; i ++){
                TreeNode node = queue.poll();
                if (!isReverse) aux.add(node.val);
                else aux.addFirst(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            isReverse = !isReverse;
            res.add(new ArrayList<>(aux));
        }
        return res;
    }
}
