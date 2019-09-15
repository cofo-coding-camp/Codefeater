package wechat.mine;
import java.util.ArrayList;
import java.util.List;

public class PathSumII_113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> aux = new ArrayList<>();
        assist(root, res, aux, sum);
        return res;
    }

    private void assist(TreeNode root, List<List<Integer>> res, List<Integer> aux, int sum) {
        if (root == null) return;
        aux.add(root.val);

        if (root.right == null && root.left == null && root.val == sum) res.add(new ArrayList<>(aux));
        if (root.right != null) assist(root.right, res, aux, sum - root.val);
        if (root.left != null) assist(root.left, res, aux, sum - root.val);

        aux.remove(aux.size() - 1);
    }
}
