package datastructures.queueandstack.Operation;

interface Stack<E> {
	boolean isEmpty();

	void push(E e);

	E pop();

	E peek();

	int size();

	void print();
}
