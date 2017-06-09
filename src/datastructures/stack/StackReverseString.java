package datastructures.stack;

import java.util.ArrayDeque;

public class StackReverseString {
	private static ArrayDeque<Character> myStack = new ArrayDeque<>();

	public static void main(String[] args) {
		String[] samples = { "gotta", "lovely", "Smart" };
		for (String i : samples) {
			System.out.println(reverse(i));
		}
	}

	private static String reverse(String s) {
		for (int i = 0; i < s.length(); i++) {
			myStack.push(s.charAt(i));
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			sb.append(myStack.pop());
		}
		return sb.toString();
	}
}
