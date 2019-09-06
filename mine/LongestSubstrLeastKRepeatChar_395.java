package wechat.mine;

public class LongestSubstrLeastKRepeatChar_395 {
    public int longestSubstring(String s, int k) {
        int len = s.length();
        if (len == 0 || k > len) return 0;
        if (k < 2) return len;

        return assit(s.toCharArray(), k, 0, len - 1);
    }

    private static int assit(char[] chars, int k, int p1, int p2){
        if (p2 - p1 + 1 < k) return 0;
        int[] times = new int[26];

        // 统计出现的频次
        for (int i = p1; i <= p2; i ++) times[chars[i] - 'a'] ++;

        // 如果字符出现频次小于k,则不可能出现在结果子串中
        while (p2 - p1 + 1 >= k && times[chars[p1] - 'a'] < k) p1 ++;
        while (p2 - p1 + 1 >= k && times[chars[p2] - 'a'] < k) p2 --;

        for (int i = p1; i <= p2; i ++) {
            //如果第i个不符合要求，切分左右做递归
            if (times[chars[i] - 'a'] < k)
                return Math.max(assit(chars, k, p1, i - 1), assit(chars, k, i + 1, p2));
        }
        return p2 - p1 + 1;
    }
}
