package wechat.group;

public class ProductMax_152 {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE, imax = 1, imin = 1;
        for (int i = 0; i < nums.length; i ++){
            if (nums[i] < 0) {
                int aux = imax;
                imax = imin;
                imin = aux;
            }

            imax = Math.max(imax*nums[i], nums[i]);
            imin = Math.min(imin*nums[i], nums[i]);

            max = Math.max(max, imax);
        }
        return max;
    }
}