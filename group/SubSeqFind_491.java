package wechat.group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class SubSeqFind_491 {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> aux = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];
        dfs(nums, res, aux, 0, visited);
        return res;
    }

    public void dfs(int[] nums, List<List<Integer>> res, List<Integer> aux, int idx, boolean[] visited){
        if (aux.size() >= 2) {
            res.add(new ArrayList<>(aux));
        }
        for (int i = idx; i < nums.length; i ++){
            if (!visited[idx]){
                visited[idx] = true;
                aux.add(nums[idx]);
                dfs(nums, res, aux, idx + 1, visited);
                aux.remove(aux.size() - 1);
                visited[idx] = false;
            }
        }
        return;
    }
}
