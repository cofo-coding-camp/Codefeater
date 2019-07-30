package wechat.group;

public class RotateRight_61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) return head;
        ListNode cursor = head;
        ListNode tail = null;
        int len = 1;
        while (cursor.next != null){
            cursor = cursor.next;
            len ++;
        }
        int loop = len - k%len;
        tail = cursor;
        cursor.next = head;
        cursor = head;

        for (int i = 0; i < loop; i ++){
            cursor = cursor.next;
            tail = tail.next;
        }
        tail.next = null;
        return cursor;
    }
}
