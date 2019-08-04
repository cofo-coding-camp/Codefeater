package wechat.group;


public class CoinChange2_518 {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int j = 1; j <= amount; j ++){
                if (j >= coin){
                    dp[j] = dp[j] + dp[j-coin];
                }
            }
        }
        return dp[amount];
    }
}
