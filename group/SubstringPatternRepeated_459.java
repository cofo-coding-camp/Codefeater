package wechat.group;

import java.util.HashSet;

public class SubstringPatternRepeated_459 {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length(), i = 0;
        for (int t = 1; t <= len/2; t ++){
            if (len % t != 0) continue;
            for (i = t; i < len && s.charAt(i % t) == s.charAt(i); i ++);
            if (i == len) return true;
        }
        return false;
    }
}
