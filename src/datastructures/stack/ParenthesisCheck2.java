package datastructures.stack;

import java.util.Stack;

public class ParenthesisCheck2 {

	private Stack<Character> myStack = new Stack<>();
	private static String open = "([<{";
	private static String close = ")]>}";

	private static boolean isOpen(char ch) {
		return open.indexOf(ch) != -1;
	}

	private static boolean isClose(char ch) {
		return close.indexOf(ch) != -1;
	}

	private boolean isBalanced(String s) {
		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			if (isOpen(x)) {
				myStack.push(x);
			}
			if (isClose(x))
				if (myStack.empty())
					return false;
				else {
					if (open.indexOf(myStack.peek()) == close.indexOf(x))
						myStack.pop();
				}
		}
		if (!myStack.empty())
			return false;
		return true;
	}

	public static void main(String[] args) {
		String[] tests = { "{(X)[XY]}", "(a + b[(x+y)] + 10)", "()[]<>{}",
				"([x]a)", "]}", "()<", "(][)", "([])" };
		for (String s : tests) {
			ParenthesisCheck2 pc = new ParenthesisCheck2();
			System.out.println(s + " = " + pc.isBalanced(s));
		}
	}
}