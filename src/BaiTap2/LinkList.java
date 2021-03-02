package BaiTap2;

import java.util.LinkedList;

public class LinkList<T> {
    public Node head;
    public Node tail;

    public LinkList(Node head, Node tail) {
        this.head = null;
        this.tail = null;
    }

    public void enqueue(Node data) {
        Node temp = new Node(data);
        if (this.head == this.tail) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.link = temp;
        this.tail = temp;
    }

    public Node dequeue() {
        if (this.head == null) {
            return null;
        }
        Node temp = head;
        head.link = head;
        return temp;
    }
}


