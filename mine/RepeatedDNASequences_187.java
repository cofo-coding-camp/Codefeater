package wechat.mine;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedDNASequences_187 {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<>();
        if (s.length() < 10) return res;

        //存储已经遍历过的字符串
        Set<String> set1 = new HashSet<>();
        //存储符合条件的子字符串
        Set<String> set2 = new HashSet<>();

        for (int i = 0; i + 10 <= s.length(); i ++){
            String seq = s.substring(i, i + 10);

            if (set1.contains(seq)) set2.add(seq);
            set1.add(seq);
        }
        res.addAll(set2);
        return res;
    }
}