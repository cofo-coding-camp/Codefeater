package wechat.mine;


public class Powxn_50 {
    public double myPow(double x, int n) {
        double res = 1.0;
        for (int i = n; i != 0; i /=2){
            if (i % 2 != 0) res = res * x;
            x = x * x;
        }
        return n < 0 ? 1/res : res;
    }
}
