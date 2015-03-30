import java.util.Arrays;

public class TestClass {
	public static void main(String[] args){
		LinkedList list = new LinkedList();
		Node n1 = new Node("a");
		Node n2 = new Node("b");
		Node n3 = new Node("c");
		Node n4 = new Node("d");
		Node n5 = new Node("e");
		list.addNodeToBeginning(n1);
		list.addNodeToBeginning(n2);
		list.addNodeToEnd(n3);
		list.addNodeToEnd(n4);
		list.addNodeAfterNode(n5, n3);
		list.print();
		System.out.println("");
		list.removeNodeFromBeginning();
		list.removeNodeFromEnd();
		list.print();
		System.out.println("");
		System.out.println(list.concatenate());
	}
}