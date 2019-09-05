package wechat.mine;

public class ValidPerfectSquare_367 {
    public boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;

        while (start <= end) {
            int mid = (end - start)/2 + start;
            if ((double)mid * mid > num) end = mid - 1;
            else if ((double)mid * mid < num) start = mid + 1;
            else return true;

        }
        return false;
    }
}
