package wechat.mine;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergekSortedLists_23 {
    // 优先队列
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                if (o1.val < o2.val) return -1;
                else if (o1.val == o2.val) return 0;
                else return 1;
            }
        });
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        for (ListNode node : lists){
            if (node != null) queue.add(node);
        }
        while (!queue.isEmpty()){
            p.next = queue.poll();
            p = p.next;
            if (p.next != null) queue.add(p.next);//神来之笔
        }
        return dummy.next;
    }
    //分治的算法思路
    public ListNode mgLs(ListNode[] lists){
        if (lists == null || lists.length == 0) return null;
        return merge(lists, 0, lists.length - 1);
    }
    private ListNode merge(ListNode[] lists, int left, int right){
        if (left == right) return lists[left];
        int mid = left + (right - left)/2;
        ListNode l1 = merge(lists, left, mid);
        ListNode l2 = merge(lists, mid + 1, right);
        return mergeTwoLists(l1,l2);
    }
    private ListNode mergeTwoLists(ListNode l1, ListNode l2){
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
