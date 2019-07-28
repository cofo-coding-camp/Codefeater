package wechat.mine;

import java.util.*;

public class ReverseWordsinaString_151 {
    public String reverseWords(String s) {
        List<String> list = new ArrayList<>();

        for(String str : s.split(" ")){
            if(str.length() > 0) list.add(0, str);
        }
        return String.join(" ", list);
    }
}
