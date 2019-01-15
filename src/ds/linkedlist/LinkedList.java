package ds.linkedlist;

public class LinkedList {

	public Node root;
	
	public LinkedList() {
		root = null;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public void insert(int data) {
		Node node = new Node(data);
		node.next = root;
		root = node;
	}
	
	public Node delete() {
		Node temp = root;
		root = root.next;
		return temp;
	}
	
	public void printList() {
		Node currentNode = root;
		System.out.print("List: ");
		while (currentNode != null) {
			currentNode.printNode();
			currentNode = currentNode.next;
		}
		System.out.println("");
	}
	
}
