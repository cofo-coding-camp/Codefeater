package leetcode.lesson_9_wechat;

public class BestTimetoBuyandSellStock_121 {
    public int maxProfit(int[] prices) {
        int res = 0, minv = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i ++){
            minv = Math.min(minv, prices[i]);
            res = Math.max(res, prices[i] - minv);
        }
        return res;
    }
}
