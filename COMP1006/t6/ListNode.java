/*
|-----|        |-----|        |-----|        |-----|        |-----|
| str |-.next->| str |-.next->| str |-.next->| str |-.next->| str |
|_____|        |_____|        |_____|        |_____|        |_____|
*/
public class ListNode {
  String data;
  ListNode next;
  
  public ListNode(String s, ListNode n) {
    this.data = s;
    this.next = n;
  }
  
  public ListNode(String s) {
    this(s, null);
  }
  
  public String stringAt(int n) {
    if (n == 0) {
      return this.data;
    } else {
      int count = 0;
      for (ListNode i = this; i != null; i = i.next) {
        if (count == n) {
          return i.data;
        }
        count++;
      }
      return null;
    }
  }

  public String stringAt() {
    return this.stringAt(0);
  }

  public static ListNode head(int len) {
    ListNode last = new ListNode("head");
    ListNode node;
    for (int i = 0; i < len; i++) {
      node = new ListNode("node"+i, last);
      last = node;
    }
    return last;
  }

  public void printFromHere() {
    for(ListNode i = this; i != null; i = i.next) {
      System.out.println(i.data);
    }
  }
  
  public static void main(String args[]) {

    ListNode l1 = new ListNode("node1");
    ListNode l2 = new ListNode("node2",l1);
    ListNode l3 = new ListNode("node3",l2);
    ListNode l4 = new ListNode("node4",l3);
    ListNode l5 = new ListNode("node5",l4);
    System.out.println("node5(+0) -> " + l5.stringAt());
    System.out.println("node5(+2) -> " + l5.stringAt(2));
    System.out.println("node2(+5) -> " + l2.stringAt(5));
    ListNode l = ListNode.head(5);
    l.printFromHere();
  }
}