package wechat.group;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SortCharactersByFrequency_451 {
    public String frequencySort(String s) {
        char[] chs = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int maxTimes = -1;

        for (char c : chs){
            if (!map.containsKey(c)) map.put(c,1);
            else map.put(c, map.get(c) + 1);
            maxTimes = map.get(c) > maxTimes ? map.get(c) : maxTimes;
        }

        ArrayList<Character>[] bucks = new ArrayList[maxTimes + 1];
        for (char c : map.keySet()){
            int freq = map.get(c);
            if (bucks[freq] == null){
                bucks[freq] = new ArrayList<>();
            }
            bucks[freq].add(c);
        }

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
