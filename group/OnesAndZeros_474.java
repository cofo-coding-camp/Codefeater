package wechat.group;

public class OnesAndZeros_474 {
    public int findMaxForm(String[] strs, int m, int n) {
        if (strs.length == 0) return 0;

        //背包问题，都需要使用二维数组来表示，dp[i][j]表示使用i个0和j个1能表示的字符串的最大数量
        int[][] dp = new int[m + 1][n + 1];

        for (String s : strs) {
            //状态转移方程：dp[i][j] = Math.max(dp[i][j], 1 + dp[i - numZero][j - numOne])
            int zeros = 0, ones = 0;
            for (char c : s.toCharArray()) {
                if (c == '0') zeros++;
                else ones ++;
            }
            //下面为经典的背包解法
            for (int i = m; i >= zeros; i --)
                for (int j = n; j >= ones ; j --)
                    dp[i][j] = Math.max(dp[i][j], 1 + dp[i - zeros][j - ones]);
        }
        return dp[m][n];
    }
}
