package leetcode.lesson_9_wechat;

public class BestTimetoBuyandSellStockII_122 {
    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 0; i < prices.length - 1; i ++){
            if (prices[i] < prices[i + 1]) res = res + (prices[i + 1] - prices[i]);
        }
        return res;
    }
}
