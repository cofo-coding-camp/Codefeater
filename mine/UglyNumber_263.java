package wechat.mine;

public class UglyNumber_263 {
    public boolean isUgly(int num) {

        while (num % 2 == 0 && num > 0) num = num/2;
        while (num % 3 == 0 && num > 0) num = num/3;
        while (num % 5 == 0 && num > 0) num = num/5;

        return num == 1;
    }
}
