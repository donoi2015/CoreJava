package datastructures.queueandstack.Operation;

public class StackToQueue {

	private MyQueue<String> q = new MyQueue<>();
	private MyStack<String> s = new MyStack<>();
	private MyStack<String> s2 = new MyStack<>();

	private void populateStack() {
		String[] testStrings = { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat",
				"Sun" };
		for (String i : testStrings) {
			s.push(i);
		}
	}

	private void copyToQueue() {
		// copy to Stack 2
		int len = s.size();
		for (int i = 0; i < len; i++) {
			s2.push(s.pop());
		}
		// copy to Queue from Stack 2
		for (int i = 0; i < len; i++) {
			q.enqueue(s2.pop());
		}
	}

	private void checkStackAndQueue() {
		// print stack and queue
		System.out.println("Stack: " + s.size());
		s.print();
		System.out.println("\nQueue: " + q.size());
		q.print();
	}

	public static void main(String[] args) {
		StackToQueue mt = new StackToQueue();
		mt.populateStack();
		System.out.println("----- Before copying -----");
		mt.checkStackAndQueue();
		mt.copyToQueue();
		System.out.println("----- After copying -----");
		mt.checkStackAndQueue();
	}
}