package wechat.mine;

public class GasStation_134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        for (int i = 0; i < gas.length; i ++){
            if (gas[i] < cost[i]) continue;
            int j = i, cnt = 0;
            int gsum = 0;
            while (j - i < gas.length){


                gsum += (gas[j%gas.length] - cost[j%gas.length]);
                if (gsum < 0) break;
                j ++;
                cnt ++;

            }
            if (cnt == gas.length) return i;
        }
        return -1;
    }

    public static void main(String[] args){
        GasStation_134 gs = new GasStation_134();
        int[] gas = {3,3,4};
        int[] cost= {3,4,4};
        System.out.println(gs.canCompleteCircuit(gas, cost));
    }
}
