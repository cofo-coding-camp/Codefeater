package wechat.group;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SortCharactersByFrequency_451 {
    public String frequencySort(String s) {
        char[] chs = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int maxTimes = -1;

        // 导入数组，获取基础的信息
        for (char c : chs){
            if (!map.containsKey(c)) map.put(c,1);
            else map.put(c, map.get(c) + 1);
            maxTimes = map.get(c) > maxTimes ? map.get(c) : maxTimes;
        }

        ArrayList<Character>[] bucks = new ArrayList[maxTimes + 1];

        // 获取keyset, 维护最终的一个桶排序
        for (char c : map.keySet()){
            int freq = map.get(c);
            if (bucks[freq] == null){
                bucks[freq] = new ArrayList<>();
            }
            bucks[freq].add(c);
        }

        // 处理想要的答案
        int p = 0;
        for (int i = maxTimes; i >= 0; i --){
            if (bucks[i] != null){
                for (char c : bucks[i]){
                    for (int j = 0; j < i; j ++){
                        chs[p++] = c;
                    }
                }
            }
        }
        return new String(chs);
    }
}
