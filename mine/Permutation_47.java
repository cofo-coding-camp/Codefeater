package wechat.mine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Permutation_47 {

    public List<List<Integer>> ans = new ArrayList<List<Integer>>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> aux = new ArrayList<>();

        Arrays.sort(nums);

        for (int num : nums) aux.add(num);

        backtrack(aux, 0, aux.size() - 1);
        return ans;

    }

    public void backtrack(List<Integer> aux, int left, int right){
        if (left == right) ans.add(new ArrayList<>(aux));
        else{
            for (int i = left; i < right; i ++){
                if (i != left && aux.get(left) == aux.get(i)) continue;
                Collections.swap(aux, left, i);
                backtrack(aux, left + 1, right);
            }

        }
    }
}
