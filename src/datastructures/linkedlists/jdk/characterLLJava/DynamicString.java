package datastructures.linkedlists.jdk.characterLLJava;

import java.util.LinkedList;
import java.util.Scanner;

class DynamicString {
	private LinkedList<Character> ll = null;

	public DynamicString() {
		ll = new LinkedList<>();
	}

	public void readString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String input = sc.next();
		for (char i : input.toCharArray()) {
			ll.add(i);
		}
		sc.close();
	}

	public static void writeString(DynamicString ds) {
		System.out.println("List (first to last): ");
		for (Character aLl : ds.ll) {
			System.out.print(aLl + " ");
		}
		System.out.println("");
	}

	public void clear() {
		ll.clear();
	}

	public int size() {
		return ll.size();
	}

	public boolean equals(LinkedList<Character> a) {
		return ll.equals(a);
	}

	public void concatenate(LinkedList<Character> a) {
		for (Character anA : a) {
			ll.add(anA);
		}
	}

}
