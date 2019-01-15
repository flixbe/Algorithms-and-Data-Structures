package ds.stack;

public class Stack {

	private static final int MAX_SIZE = 1024;
	int top;
	int[] array = new int[MAX_SIZE];
	
	public Stack() {
		top = -1;
	}
	
	public boolean isEmpyt() {
		return top < 0;
	}

	public void push(int x) {
		if (top >= (MAX_SIZE - 1)) {
			System.out.println("Stack Overflow");
		} else {
			array[++top] = x;
			System.out.println("[" + x + "]" + " Pushed into stack.");
		}
	}
	
	public void pop() {
		if (top < 0)
			System.out.println("Stack Underflow");
		else
			System.out.println("[" + array[top--] + "]" + " Popped from stack.");
	}
	
}