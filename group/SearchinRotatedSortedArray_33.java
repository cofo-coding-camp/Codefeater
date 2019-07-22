package wechat.group;

public class SearchinRotatedSortedArray_33 {
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int lo = 0, hi = nums.length -1;
        while (lo <= hi){
            int mid = lo + (hi - lo)/2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < nums[hi]){
                if (nums[mid] < target && nums[hi] >= target) lo = mid + 1;
                else hi = mid - 1;
            }else{
                if (nums[mid] > target && nums[lo] <= target) hi = mid - 1;
                else lo = mid + 1;
            }
        }
        return -1;
    }
}
