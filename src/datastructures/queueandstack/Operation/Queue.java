package datastructures.queueandstack.Operation;

interface Queue<E> {
	boolean isEmpty();

	void enqueue(E e);

	E dequeue();

	E peek();

	int size();

	void print();
}
