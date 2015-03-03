public class Node {
	Match data;
	Node next;
	Node prev;
	public Node(Match d, Node n, Node p){
		this.data = d;
		this.next = n;
		this.prev = p;
	}

	public Node(Match d){
		this(d, null, null);
	}

	public void printNext(){
		if (this.next != null) {
			System.out.println(this.data);
			this.next.printNext();
		} else {
			System.out.println(this.data);
		}
	}
}