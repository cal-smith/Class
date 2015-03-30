package LinkedList;

/**
 * Created by cal on 3/3/15.
 */
public class Node {
    private Object data;
    private Node next;

    public Node(Object d, Node n, Node p) {
        this.data = d;
        this.next = n;
    }

    public Node(Object d) {
        this(d, null, null);
    }

    public void setNext(Node n) { this.next = n; }
    public Object getData () { return this.data; }
    public Node getNext () { return this.next; }
}
