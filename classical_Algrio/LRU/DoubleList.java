package wechat.classical_Algrio.LRU;

public class DoubleList {
    private Node head, tail;
    private int size;

    public DoubleList(){
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
        size = 0;
    }

    public void addFirst(Node x){

        //处理四条链路边
        x.next = head.next;
        x.prev = head;
        head.next.prev = x;
        head.next = x;
        size ++;
    }

    public void remove(Node x){
        x.prev.next = x.next;
        x.next.prev = x.prev;
        size --;
    }
    public Node removeLast(){
        if (tail.prev == head){
            return null;
        }
        Node last = tail.prev;
        remove(last);
        return last;
    }

    public int size() {return size;}
}
