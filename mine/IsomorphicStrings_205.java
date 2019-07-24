package wechat.mine;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings_205 {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map = new HashMap<>();
        if (s.length() != t.length()) return false;
        int i = 0, n = s.length() - 1;
        while( i <= n ){
            if (!map.containsKey(s.charAt(i))){
                if (map.containsValue(t.charAt(i))) return false;
                map.put(s.charAt(i), t.charAt(i));
            }else {
                if (map.get(s.charAt(i)) != t.charAt(i)) return false;
            }
            i ++;
        }
        return true;
    }
}
