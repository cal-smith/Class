public class LinkedList {
	Node head;

	public LinkedList(){
		this.head = null;
	}

	public LinkedList(Node newHead) {
		this.head = newHead;
	}
	  
	public void addNodeToBeginning(Node newNode) {
		newNode.next = this.head;
		newNode.prev = null;
		this.head = newNode;
	}
	  
	public void addNodeToEnd(Node newNode) {
		if(this.head == null) {
			this.head = newNode;
			this.head.prev = null;
		} else {
			Node current = this.head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = newNode;
			newNode.prev = current;
		}
	}
	  
	public void addNodeAfterNode(Node newNode, Node addAfter) {
		if(this.head != null) {
			Node current = this.head;
			while(current != null && current != addAfter) {
				current = current.next;
			}
			// current is now either null (if addAfter isn't in list)
			// OR current is now addAfter
			if(current != null) {
				newNode.next = current.next;
				newNode.prev = current;
				current.next.prev = newNode;
				current.next = newNode;
			}
		}
	}
	  
	public void removeNodeFromBeginning() {
		if(this.head != null) {
			this.head = this.head.next;
			this.head.prev = null;
		}
	}
	  
	public void removeNodeFromEnd() {
		if(this.head != null) {
			if(this.head.next == null) {
				this.head = null;
			} else {
				Node current = this.head;
				Node previous = null;
				while(current.next != null) {
			  		previous = current;
			  		current = current.next;
				}
				previous.next = null;
				current.prev = null;
			}
		}
	}
  
	public void removeNode(Node toRemove) {
		if(this.head != null) {
			Node current = this.head;
			while(current.next != null && current.next != toRemove) {
				current = current.next;
			}
			// at this point, current.next is null OR current.next is toRemove
			if(current.next != null) {
				current.next = current.next.next;
			}
		}
	}

	public String concatenate() {
		String accumulate = "";
		for(Node i = this.head; i != null; i = i.next){
			accumulate += i.data;
		}
		return accumulate;
	}

	public void reverse() {
		//TODO
	}

	public void print(){
		for(Node i = this.head; i != null; i = i.next){
			System.out.println(i.data);
		}
	}
}