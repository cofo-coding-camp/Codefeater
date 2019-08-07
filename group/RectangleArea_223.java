package wechat.group;

public class RectangleArea_223 {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int sumArea = (D - B)*(C - A) + (H - F)*(G - E);
        if (E >= C || G <= A || H <= B || F >= D) return sumArea ;
        int mAreaWidth = Math.min(C, G) - Math.max(E, A);
        int mAreaHeight = Math.min(H,D) - Math.max(B,F);
        int mArea = mAreaHeight * mAreaWidth;
        return sumArea - mArea;
    }
}
