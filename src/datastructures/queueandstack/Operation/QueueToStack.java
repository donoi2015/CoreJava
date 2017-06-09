package datastructures.queueandstack.Operation;

public class QueueToStack {

	private MyQueue<String> q = new MyQueue<>();
	private MyStack<String> s = new MyStack<>();

	private void populateQueue() {
		String[] testStrings = { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat",	"Sun" };
		for (String i : testStrings) {
			q.enqueue(i);
		}
	}

	private void copyToStack() {
		// copy to Stack 2
		int len = q.size();
		for (int i = 0; i < len; i++) {
			s.push(q.dequeue());
		}
	}

	private void checkStackAndQueue() {
		// print stack and queue
		System.out.println("Queue: " + q.size());
		q.print();
		System.out.println("\nStack: " + s.size());
		s.print();
	}

	public static void main(String[] args) {
		QueueToStack mt = new QueueToStack();
		mt.populateQueue();
		System.out.println("----- Before copying -----");
		mt.checkStackAndQueue();
		mt.copyToStack();
		System.out.println("----- After copying -----");
		mt.checkStackAndQueue();
	}

}
