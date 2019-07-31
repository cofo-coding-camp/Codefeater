package wechat.mine;

public class PermutationNext {
    public void nextPermutation(int[] nums) {
        if (nums.length >= 2) assist(nums);
    }

    public void assist(int[] nums){
        int min_idx = -1;
        int max_idx = -1;
        for (int i = 0; i < nums.length - 1; i ++){
            int cur = nums[i];
            int forward = nums[i + 1];

            if (cur < forward){
                min_idx = Math.max(min_idx, i);
            }
        }

        if (min_idx == nums.length - 1 || min_idx == -1) {
            swap(nums, 0);
            return;
        }

        for (int j = min_idx + 1; j < nums.length; j ++){
            if (nums[min_idx] < nums[j]){
                max_idx = Math.max(min_idx, j);
            }
        }
        exch(nums, min_idx, max_idx);
        swap(nums, min_idx + 1);
    }

    public void exch(int[] nums, int lo, int hi){
        int tmp = nums[lo];
        nums[lo] = nums[hi];
        nums[hi] = tmp;
    }

    public void swap(int[] nums, int min_idx){
        int len = (nums.length - min_idx + 1)/2;
        for (int j = 0; j < len; j ++){
            int tmp = nums[min_idx + j];
            nums[min_idx + j] = nums[nums.length - 1 - j];
            nums[nums.length - 1 - j] = tmp;
        }
    }
}
