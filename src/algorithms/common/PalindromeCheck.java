package algorithms.common;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class PalindromeCheck {

	public static void main(String[] args) {
		String[] samples = { "aka", "gogog", "someone", "agga", "aama" };
		for (String i : samples) {
			System.out.println(checkPalindrome2(i));
		}
	}

	public static boolean checkPalindrome(String str) {
		ArrayDeque<Character> myStack = new ArrayDeque<>();
		LinkedList<Character> myQueue = new LinkedList<>();

		for (int j = 0; j < str.length(); j++) {
			myStack.addFirst(str.charAt(j));
			myQueue.add(str.charAt(j));
		}

		for (int j = 0; j < str.length() / 2; j++) {
			char s = myStack.pop();
			char q = myQueue.pollFirst();
			if (s != q)
				return false;
		}
		return true;
	}

	private static boolean checkPalindrome2(String str) {
		for (int j = 0; j < str.length()/2; j++) {
			if(str.charAt(j) != str.charAt(str.length()-1-j))
				return false;
		}
		return true;
	}
}