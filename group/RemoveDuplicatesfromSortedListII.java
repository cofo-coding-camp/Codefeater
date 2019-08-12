package wechat.group;

public class RemoveDuplicatesfromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode DummyNode = new ListNode(0);
        DummyNode.next = head;
        ListNode prev = DummyNode;
        ListNode cur = head;

        while (cur != null){
            while (cur.next != null && cur.val == cur.next.val){
                cur = cur.next;
            }

            if (prev.next == cur) prev = prev.next;
            else prev.next = cur.next;
            cur = cur.next;
        }
        return DummyNode.next;
    }
}
