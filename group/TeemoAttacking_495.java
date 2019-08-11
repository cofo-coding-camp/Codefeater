package wechat.group;

public class TeemoAttacking_495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries == null || timeSeries.length == 0) return 0;
        if (timeSeries.length <= 1) return duration;
        int res = 0;

        for (int i = 1; i < timeSeries.length; i ++){
            if (timeSeries[i] - timeSeries[i-1] > duration){
                res += duration;
            }else{
                res += timeSeries[i] - timeSeries[i-1];
            }
        }
        res = res + duration;
        return res;
    }
}
