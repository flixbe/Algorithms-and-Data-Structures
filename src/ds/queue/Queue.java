package ds.queue;

public class Queue {

	private Node root;
	
	public Queue(int value) {
		root = new Node(value);
	}
	
	public void enque(int value) {
		Node node = new Node(value);
		node.setNext(root);
		root = node;
	}
	
	public Node deque() {
		Node node = root;
		Node previous = null;
		while (node.next() != null) {
			previous = node;
			node = node.next();
		}
		node = previous.next();
		previous.setNext(null);
		
		return node;
	}
	
}