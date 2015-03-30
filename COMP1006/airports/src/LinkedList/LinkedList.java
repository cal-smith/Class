package LinkedList;

import java.util.Objects;

/**
 * Created by cal on 3/3/15.
 */
public class LinkedList {
    private Node head;
    private Node last;
    private int length;

    public LinkedList(){
        this.length = 0;
        this.head = null;
        this.last = null;
    }

    public void addNode(Node n){
        if (this.last == null) {
            this.last = n;
        }
        n.setNext(this.head);
        this.head = n;
        //this.length++;
    }

    public void addNodeToEnd(Node n){
        if (this.head == null) {
            this.head = n;
            this.last = n;
        } else {
            this.last.setNext(n);
            this.last = n;
        }
        this.length++;
    }

    public void removeNode(Node remove){
        if (this.head == remove && this.head.getNext() == null) {
            this.head = null;
            this.last = null;
        } else if (this.head != null) {
            Node current = this.head;
            while(current.getNext() != null && current.getData() != remove){
                current = current.getNext();
            }
            if (current.getNext() != null) {
                current.setNext(current.getNext().getNext());
            }
        }
        this.length--;
    }

    public Object[] toArray() {
        Object array[] = new Object[this.length];
        int j = 0;
        for(Node i = this.head; i != null; i = i.getNext()){
            array[j] = i.getData();
            j++;
        }
        return array;
    }

    public Node getHead() { return this.head; };
    public int length() { return this.length; };
    public Object get(int index) {
        int j = 0;
        for (Node i = this.head; i.getNext() != null; i = i.getNext()) {
            if (j == index) {
                return i.getData();
            }
        }
        return null;
    };
}
