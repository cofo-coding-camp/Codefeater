package wechat.mine;
import java.util.ArrayList;
import java.util.List;

public class CombinationSum_39 {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates == null || candidates.length == 0 || target < 0) return ans;

        List<Integer> aux = new ArrayList<>();
        process(0, candidates, target, aux);
        return ans;
    }

    private void process(int start, int[] candidates, int target, List<Integer> aux){
        if (target < 0) return;
        if (target == 0) ans.add(new ArrayList<>(aux));
        else {
            for (int i = start; i < candidates.length; i ++){
                aux.add(candidates[i]);
                process(i, candidates, target - candidates[i], aux);
                aux.remove(aux.size() - 1);
            }
        }
    }
}
