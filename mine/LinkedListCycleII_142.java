package wechat.mine;

public class LinkedListCycleII_142 {

    private ListNode getIntersect(ListNode head) {
        ListNode tortoise = head;
        ListNode hare = head;

        while (hare != null && hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;
            if (tortoise == head) return tortoise;
        }
        return null;
    }

    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        //detect intersect
        ListNode intersect = getIntersect(head);
        if (intersect == null) return null;

        ListNode ptr1 = head;
        ListNode ptr2 = intersect;

        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr1;
    }
}
