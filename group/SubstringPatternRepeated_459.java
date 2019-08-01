package wechat.group;

import java.util.HashSet;

public class SubstringPatternRepeated {
    public boolean repeatedSubstringPattern(String s) {

        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i ++){
            set.add(s.charAt(i));
        }


    }
}
