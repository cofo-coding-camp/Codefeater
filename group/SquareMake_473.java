package wechat.group;

import java.util.Arrays;

public class SquareMake_473 {
    public boolean makesquare(int[] nums) {
        if (nums == null || nums.length < 4) return false;
        int sum = 0;
        for (int i : nums) sum += i;
        if (sum % 4 != 0) return false;
        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];
        return edge_judge(nums, visited, sum/4);
    }

    public boolean edge_judge(int[] nums, boolean[] visited, int target){
        for (int i = 0; i < 4; i ++){
            if(!dfs(nums, visited, target)) return false;
        }
        return true;
    }

    public boolean dfs(int[] nums, boolean[] visited, int target){
        if (target == 0) return true;
        for (int i = nums.length - 1; i >= 0; i ++){
            int chop = nums[i];
            if (!visited[i] && target >= chop){
                visited[i] = true;
                if (dfs(nums, visited, target - chop)) return true;
                visited[i] = false;
            }
        }
        return false;
    }
}
