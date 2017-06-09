package datastructures.queueandstack.Operation;

public class StackToStack {

	private MyStack<String> s = new MyStack<>();
	private MyStack<String> s2 = new MyStack<>();
	private MyStack<String> s3 = new MyStack<>();

	private void populateStack() {
		String[] testStrings = { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat",	"Sun" };
		for (String i : testStrings) {
			s.push(i);
		}
	}

	private void copyToStack() {
		// copy to Stack 2
		int len = s.size();
		for (int i = 0; i < len; i++) {
			s2.push(s.pop());
		}
		// copy to Queue from Stack 2
		for (int i = 0; i < len; i++) {
			s3.push(s2.pop());
		}
	}

	private void checkStacks() {
		// print stack and queue
		System.out.println("Stack1: " + s.size());
		s.print();
		System.out.println("\nStack2: " + s.size());
		s3.print();
	}

	public static void main(String[] args) {
		StackToStack mt = new StackToStack();
		mt.populateStack();
		System.out.println("----- Before copying -----");
		mt.checkStacks();
		mt.copyToStack();
		System.out.println("----- After copying -----");
		mt.checkStacks();
	}

}
