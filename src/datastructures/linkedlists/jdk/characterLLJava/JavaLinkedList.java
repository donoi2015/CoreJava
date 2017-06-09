package datastructures.linkedlists.jdk.characterLLJava;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class JavaLinkedList {
	private static LinkedList<Character> myLinkList;

	private JavaLinkedList() {
		myLinkList = new LinkedList<>();
	}

	private void readString() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = in.nextLine();
		in.close();
		for (int i = 0; i < s.length(); i++) {
			myLinkList.add(s.charAt(i));
		}

	}

	private void writeString() {
        for (Character aMyLinkList : myLinkList) {
            System.out.print(aMyLinkList + " ");
        }

	}

	public void clear() {
		myLinkList.removeAll(myLinkList);
	}

	public boolean equals(LinkedList<Character> a) {
		return myLinkList.equals(a);
	}

	private static int size() {
		return myLinkList.size();
	}

	private static void concatenate(LinkedList<Character> a) {
		Iterator<Character> it = a.iterator();
		while (it.hasNext()) {
			myLinkList.add(a.getFirst());
			a.remove();
		}
	}

	public void insert(LinkedList<Character> a, int start) {
		int num = myLinkList.get(start);

	}

	public static void main(String[] args) {
		JavaLinkedList l = new JavaLinkedList();
		l.readString();
		System.out.println(JavaLinkedList.size());
		LinkedList<Character> check = new LinkedList<>();
		check.add('a');
		check.add('c');
		check.add('d');
		// System.out.println(l.equals(check));
		// l.writeString();
		// l.clear();
		System.out.println(l.size());
		concatenate(check);
		l.writeString();
	}

}
