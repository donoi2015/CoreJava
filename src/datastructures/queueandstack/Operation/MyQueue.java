package datastructures.queueandstack.Operation;

import java.util.NoSuchElementException;

public class MyQueue<E> implements Queue<E> {

	private E[] array;
	private int size = 0;
	private int head = 0;
	private int tail = 0;

	public MyQueue() {
		array = (E[]) new Object[7];
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void enqueue(E e) {
		if (size == array.length) {
			throw new IllegalStateException("Cannot add to full queue");
		}
		array[tail] = e;
		tail = (tail + 1) % array.length;
		size++;
	}

	@Override
	public E dequeue() {
		if (size == 0) {
			throw new NoSuchElementException("Cannot remove from empty queue");
		}
		E item = array[head];
		array[head] = null;
		head = (head + 1) % array.length;
		size--;
		return item;
	}

	@Override
	public E peek() {
		if (size == 0) {
			throw new NoSuchElementException("Cannot peek into empty queue");
		}
		return array[size - 1];
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void print() {
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
