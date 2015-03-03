public class LinkedList {
	int length;
	Node last;
	Node head;

	public LinkedList(){
		this.length = 0;
		this.head = null;
		this.last = null;
	}

	public void addNode(Node n){
		if (this.last == null) {
			this.last = n;
		}
		n.next = this.head;
		this.head = n;
		this.length++;
	}

	public void tailNode(Node n){
		if (this.head == null) {
			this.head = n;
			this.last = n;
		} else {
			this.last.next = n;
			this.last = n;
		}
		this.length++;
	}

	public void removeNode(Node remove){
		if (this.head == remove && this.head.next == null) {
			this.head = null;
			this.last = null;
		} else if (this.head != null) {
			Node current = this.head;
			while(current.next != null && current.next != remove){
				current = current.next;
			}
			if (current.next != null) {
				current.next = current.next.next;
			}
		}
		this.length--;
	}

	public float winPercentage(String race){
		int wins = 0;
		for(Node i = this.head; i != null; i = i.next){
			if (i.data.winningRace().equals(race)) {
				wins++;
			}
		}
		return (float)wins / (float)this.length;
	}

	public LinkedList extractMatchesWith(String player) {
		LinkedList withplayer = new LinkedList();
		for(Node i = this.head; i != null; i = i.next){
			if (i.data.player1_name.equals(player) || i.data.player2_name.equals(player)) {
				withplayer.addNode(new Node(i.data));//alternatively, create a new Match to "copy" the old Match, as opposed to just referencing it
			}
		}
		return withplayer;
	}

	public Match[] convertToArray() {
		Match[] matcharray = new Match[this.length];
		int j = 0;
		for(Node i = this.head; i != null; i = i.next){
			matcharray[j] = i.data;
			j++;
		}
		return matcharray;
	}


	/*public void shuffleList(){
		Random rand = new Random();
		int j = 0;
		for(Node i = this.head; i != null; i = i.next){
			rand.nextInt((this.length - j) + 1) + j;
			j++;
		}
	}*/

	public void print(){
		System.out.println("List length: " + this.length);
		for(Node i = this.head; i != null; i = i.next){
			System.out.println(i.data);
		}
	}
}