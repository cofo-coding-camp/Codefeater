package wechat.group;

public class InsertionSortList_147 {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummyNode = new ListNode(0);
        ListNode cur = head;
        ListNode pre = dummyNode;
        ListNode next;

        while (cur != null){
            next = cur.next;

            while (pre.next != null && pre.next.val < cur.val){
                pre = pre.next;
            }
            cur.next = pre.next;
            pre.next = cur;
            pre = dummyNode;

            cur = next;
        }
        return dummyNode.next;
    }

    public int[] insertionSortArray(int[] nums) {
        for (int i = 1; i < nums.length; i ++){

            // 寻找元素arr[i]合适的插入位置
            for (int j = i; j > 0; j --){
                if (nums[j] < nums[j - 1]) each(nums, j, j - 1);
                else break;
            }
        }
        return nums;
    }

    public void each(int[] nums, int i , int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
