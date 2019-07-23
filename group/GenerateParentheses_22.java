package wechat.group;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses_22 {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    public void backtrack(List<String> ans, String cur, int lo, int hi, int idx){
        if (idx * 2 == cur.length()) {
            ans.add(new String(cur));
            return;
        }

        if (lo < idx){
            backtrack(ans, cur + "(", lo + 1, hi, idx);
        }
        if (hi < lo){
            backtrack(ans, cur + ")", lo, hi + 1, idx);
        }
    }
}
