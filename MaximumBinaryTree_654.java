package leetcode.lesson_9_wechat;

public class MaximumBinaryTree_654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        TreeNode root = cbt(nums, 0, nums.length -1 );
        return root;
    }

    public TreeNode cbt(int[] nums, int lo, int hi){
        if (lo > hi) return null;
        int idx = findMaxIdx(nums, lo, hi);
        int mx = nums[idx];
        TreeNode root = new TreeNode(mx);

        root.left = cbt(nums, lo, idx - 1);
        root.right = cbt(nums, idx + 1, hi);
        return root;
    }

    public int findMaxIdx(int[] nums, int lo, int hi){
        int max = nums[lo];
        int maxIdx = lo;
        for (int i = lo; i <= hi; i ++){
            if (nums[i] > max){
                max = nums[i];
                maxIdx = i;
            }
        }
        return maxIdx;
    }
}
