package wechat.group;

public class maxSubArray_53 {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        int ans = Integer.MIN_VALUE;
        int maxend = 0;
        for (int i = 0; i < nums.length; i ++){
            maxend = Math.max(maxend + nums[i], nums[i]);
            ans = Math.max(ans, maxend);
        }
        return ans;
    }

    public static int findSumMax(int[] array){
        if (array == null || array.length == 0) return 0;
        return findMaxFromLeftMiddleRight(array, 0, array.length - 1);
    }

    public static int findMaxFromLeftMiddleRight(int [] array, int left, int right){
        if (left == right) return array[left] > 0 ? array[left] : 0;
        int middle = (left + right)/2;
        int maxL = findMaxFromLeftMiddleRight(array, left, middle);
        int maxR = findMaxFromLeftMiddleRight(array, middle + 1, right);

        int maxMid = findMaxCrossMiddle(array, left, right);
        return (maxL > maxR ? maxL : maxR) > maxMid ? (maxL > maxR ? maxL : maxR) : maxMid;
    }

    private static int findMaxCrossMiddle(int[] array, int left, int right){
        if (left == right) return array[left] > 0 ? array[left] : 0;
        int mid = (left + right)/2;
        int maxL = 0;
        // 记录左半数组的加和
        int sumL = 0;
        //中间往左找，找到最大值
        for (int i = mid; i >= left; i --){
            if (sumL + array[i] > maxL){
                sumL = sumL + array[i];
                maxL = sumL;
            }
        }

        int maxR = 0;
        int sumR = 0;
        for (int j = mid + 1; j <= right; j ++){
            if (sumR + array[j] > maxR){
                sumR = sumR + array[j];
                maxR = sumR;
            }
        }
        return maxL + maxR;
    }
}
