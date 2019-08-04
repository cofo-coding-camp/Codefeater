package wechat.mine;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements_347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        int iMaxT = -1;
        for (int i = 0; i < nums.length; i ++){
            if (!map.containsKey(nums[i])) map.put(nums[i], 1);
            else map.put(nums[i], map.get(nums[i]) + 1);
            iMaxT = iMaxT > map.get(nums[i]) ? iMaxT : map.get(nums[i]);
        }

        ArrayList<Integer>[] bucks = new ArrayList[iMaxT + 1];

        for (int c : map.keySet()){
            int fre = map.get(c);
            if (bucks[fre] == null){
                bucks[fre] = new ArrayList<>();
            }
            bucks[fre].add(c);
        }

        int p = 0;
        List<Integer> res = new ArrayList<>();
        for (int i = iMaxT; i > 0; i --){
            if (p == k) return res;
            if (bucks[i] != null){
                res.addAll(bucks[i]);
                p += bucks[i].size();
            }
            p ++;
        }
        return res;
    }
}
