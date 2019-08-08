package wechat.group;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostorderNode_145 {
    public List<Integer> postorderTraversal(TreeNode root) {

        if (root == null) return null;
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> sk = new Stack<>();
        sk.push(root);

        while (!sk.isEmpty()){
            TreeNode aux = sk.peek();
            if (aux.left == null && aux.right == null){
                //依赖pop来增加结果的大小
                res.add(sk.pop().val);
            }else{
                //先增加right, 首先pop出来的的是left元素
                if (aux.right != null) sk.push(aux.right);
                if (aux.left != null) sk.push(aux.left);
                aux.right = null;
                aux.left = null;
            }
        }
        return res;
    }
}
