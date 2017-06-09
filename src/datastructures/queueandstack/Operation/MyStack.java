package datastructures.queueandstack.Operation;

import java.util.NoSuchElementException;

public class MyStack<E> implements Stack<E> {

	private E[] array;
	private int size = 0;

	public MyStack() {
		array = (E[]) new Object[7];
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void push(E e) {
		if (size == array.length) {
			throw new IllegalStateException("Cannot add to full stack");
		}
		array[size++] = e;
	}

	@Override
	public E pop() {
		if (size == 0) {
			throw new NoSuchElementException("Cannot pop from empty stack");
		}
		E result = array[size - 1];
		array[--size] = null;
		return result;
	}

	@Override
	public E peek() {
		if (size == 0) {
			throw new NoSuchElementException("Cannot peek into empty stack");
		}
		return array[size - 1];
	}

	@Override
	public int size() {
		return size;
	}

	public void print() {
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
