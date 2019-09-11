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
}
