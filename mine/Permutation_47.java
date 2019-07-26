
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation_47 {

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> aux = new ArrayList<>();
        assist(nums, ans, 0, aux;
        return ans;
    }

    public void assist(int[] nums, List<List<Integer>> ans, int idx, List<Integer> aux){
        if (idx == nums.length) ans.add(new ArrayList<>(aux));

        for (int i = idx; i < nums.length; i ++){

        }
    }
}
