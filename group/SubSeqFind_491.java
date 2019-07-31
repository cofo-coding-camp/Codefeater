package wechat.group;

import java.util.*;

public class SubSeqFind_491 {

    Set<List<Integer>> set = new HashSet<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        Arrays.sort(nums);
        if (nums.length >= 2) {
            for (int i = 0; i < nums.length - 1; i ++){
                List<Integer> aux = new ArrayList<>();
                aux.add(nums[i]);
                dfs(nums, aux , i + 1);
            }
        }
        return new ArrayList<>(set);
    }

    public void dfs(int[] nums, List<Integer> aux, int idx){
        if (aux.size() >= 2) set.add(new ArrayList<>(aux));
        int last_tail = aux.get(aux.size() - 1);

        for (int i = idx; i < nums.length; i ++){
            if (nums[i] >= last_tail){
                aux.add(nums[i]);
                dfs(nums, aux, i + 1);
                aux.remove(aux.size() - 1);
            }
        }
        return;
    }
}
