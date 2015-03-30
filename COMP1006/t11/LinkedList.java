public class LinkedList {
	Node head;                // first element in the list
	Node tail;                // last element in the list
	private int size;         // number of elements in the list
	
	public LinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	public void add(Node newNode) {
		/* adds a node to the front of the list */
		newNode.next = this.head;
		newNode.previous = null;
		
		if(this.size == 0) { 
			/* this is the first node added to an empty list */
			this.head = newNode;
			this.tail = newNode;
		} else {
			/* there is already at least one node in the list */
			this.head.previous = newNode;
			this.head = newNode;
			// leave tail pointing to the original tail
		}
		this.size = this.size + 1;
	}
	
	
	
	public String toString() {
		return "<" + this.toStringHelper(this.head);
	}
	
	private String toStringHelper(Node node) {
		String s = "";
		
		/* base case = no nodes remaining */
		if(node == null) {
			return s;
		}
		
		/* recursive case */
		s = s + node.getData();
		if(node != this.tail) {
			/* if node is not the last one print this */
			s = s + ", ";
		} else {
			/* we have reached the last node */
			s = s + ">";
		}
		return s + toStringHelper(node.getNext());
	}

	//**//
	public boolean find(String s){
		return this.findHelper(s, this.head);
	}

	private boolean findHelper(String s, Node n){
		if (n.getData().equals(s)) {
			return true;
		}

		if (n == this.tail) {
			return false;
		}

		return findHelper(s, n.getNext());
	}

	public String toStringReverse(){
		return "<" + this.toStringReverseHelper(this.tail);
	}

	private String toStringReverseHelper(Node n){
		String s = "";

		if (n == null) {
			return s;
		}

		s += n.getData();

		if (n != this.head) {
			s += ", ";
		} else {
			s += ">";
		}

		return s + toStringReverseHelper(n.getPrevious());
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		Node node = new Node("a");
		list.add(node);
		node = new Node("b");
		list.add(node);
		node = new Node("c");
		list.add(node);
		System.out.println(list);
		System.out.println(list.toStringReverse());
		System.out.println(list.find("b"));
		System.out.println(list.find("c"));
		System.out.println(list.find("d"));
		System.out.println(list.find("j"));
		
		LinkedList l2 = new LinkedList();
		l2.add(new Node("dog"));
		l2.add(new Node("cat"));
		l2.add(new Node("cow"));
		l2.add(new Node("wolf"));
		System.out.println(l2);
		System.out.println(l2.toStringReverse());
		System.out.println(l2.find("cat"));
		System.out.println(l2.find("wolf"));
		System.out.println(l2.find("moose"));
		System.out.println(l2.find("bird"));
	}
}