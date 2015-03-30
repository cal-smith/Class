import java.util.Arrays;

public class TestMatch {
	public static void main(String[] args){
		LinkedList list = new LinkedList();
		Node n1 = new Node(new Match("bob", "joe", "protoss", "zerg", "bob"));
		Node n2 = new Node(new Match("bob2", "joe2", "protoss", "zerg", "joe2"));
		Node n3 = new Node(new Match("bob", "joe3", "protoss", "terran", "bob"));
		list.addNode(n1);
		list.addNode(n2);
		list.addNode(n3);
		System.out.println("zerg won " + (int)(list.winPercentage("zerg")*100) + "% of the time");
		System.out.println("protoss won " + (int)(list.winPercentage("protoss")*100) + "% of the time");
		list.print();
		LinkedList l2 = list.extractMatchesWith("bob");
		l2.print();
		Match[] matches = list.convertToArray();
		System.out.println(Arrays.toString(matches));
	}
}