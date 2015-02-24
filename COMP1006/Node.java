public class Node {
	Match data;
	Node next;
	public Node(Match d, Node n){
		this.data = d;
		this.next = n;
	}

	public Node(Match d){
		this(d, null);
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