package wechat.group;

public class maxSubArray_53 {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        int ans = Integer.MIN_VALUE;
        int maxend = 0;
        for (int i = 0; i < nums.length; i ++){
            maxend = Math.max(maxend + nums[i], nums[i]);
            ans = Math.max(ans, maxend);
        }
        return ans;
    }
}
