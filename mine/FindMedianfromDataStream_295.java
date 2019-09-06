package wechat.mine;

import java.util.PriorityQueue;

public class FindMedianfromDataStream_295 {

    private int count;
    private PriorityQueue<Integer> maxheap;
    private PriorityQueue<Integer> minheap;

    public FindMedianfromDataStream_295() {
        count = 0;
        maxheap = new PriorityQueue<>((x, y) -> y - x);
        minheap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        count = count + 1;
        maxheap.offer(num);
        minheap.add(maxheap.poll());

        if ((count & 1) != 0) maxheap.add(minheap.poll());
    }

    public double findMedian() {
        if ((count & 1) == 0) return (double) (maxheap.peek() + minheap.peek())/2;
        return (double) maxheap.peek();

    }
}
