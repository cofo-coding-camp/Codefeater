package wechat.mine;

public class RotateFunction_396 {
    public int maxRotateFunction(int[] A) {

        int allsum = 0;
        int len = A.length;
        int F = 0;

        for (int i = 0; i < len; i ++){
            F += i * A[i];
            allsum += A[i];
        }
        int max = F;
        for (int i = len - 1; i >= 1; i --){
            F = F + allsum - len * A[i];
            max = Math.max(F, max);
        }
        return max;
    }
}
