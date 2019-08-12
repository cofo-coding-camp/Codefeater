package wechat.group;

public class RemoveDuplicatesfromSortedList_83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyNode = head;
        while (dummyNode != null){
            while (dummyNode.next != null && dummyNode.val == dummyNode.next.val){
                dummyNode.next = dummyNode.next.next;
            }
            dummyNode = dummyNode.next;
        }
        return head;
    }
}
