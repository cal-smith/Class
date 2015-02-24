public class TestMatch {
	public static void main(String[] args){
		LinkedList list = new LinkedList();
		list.addNode(new Match("bob", "joe", "protoss", "zerg", "bob"));
		list.addNode(new Match("bob2", "joe2", "protoss", "zerg", "joe2"));
		list.addNode(new Match("bob3", "joe3", "protoss", "terran", "bob3"));
		list.print();

		/*System.out.println("testing nodes");
		Node n1 = new Node(new Match("bob", "joe", "protoss", "zerg", "bob"));
		Node n2 = new Node(new Match("bob2", "joe2", "protoss", "zerg", "joe2"), n1);
		Node n3 = new Node(new Match("bob3", "joe3", "protoss", "terran", "bob3"), n2);
		n3.printNext();*/
	}
}