public class Node {
	String data;
	Node next;
	Node previous;

	public Node(String s) {
		this(s, null);
	}

	public Node(String s, Node n) {
		this.data = s;
		this.next = n;
		this.previous = null;
	}

	public String getData() { return this.data; }
	public Node getNext() { return this.next; }
	public Node getPrevious() { return this.previous; }
}