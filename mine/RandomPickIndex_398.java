package wechat.mine;

import java.util.Random;

public class RandomPickIndex_398 {
    private  int[] nums;
    public RandomPickIndex_398(int[] nums) {
        this.nums = nums;
    }

    public int pick(int target) {
        Random r = new Random();
        int n = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i ++){
            if (nums[i] == target){
                n ++;
                if (r.nextInt() % n == 0) index = i;
            }
        }
        return index;
    }
}
