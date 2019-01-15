package ds.linkedlist;

public class Node {

	public int value;
	public Node next;
	
	public Node(int value) {
		this.value = value;
	}
	
	public void printNode() {
		System.out.println("{" + value + "}");
	}
	
}
