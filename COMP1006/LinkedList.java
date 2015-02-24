public class LinkedList {
	int length;
	Node lastnode;
	Node head;

	public LinkedList(){
		this.length = 0;
		this.lastnode = null;
		this.head = null;
	}

	public void addNode(Match d){
		if (this.head == null) {
			Node node = new Node(d);
			this.lastnode = node;
			this.head = node;
		} else {
			Node node = new Node(d, this.lastnode);
			this.lastnode = node;
		}
		this.length++;
	}
	public void removeNode(){
	
	}
	public void readNode(){

	}

	public void print(){
		System.out.println("List length: " + this.length);
		for(Node i = this.lastnode; i.next != null; i = i.next){
			System.out.println(i.data);
		}
		System.out.println(this.head.data);
	}
}