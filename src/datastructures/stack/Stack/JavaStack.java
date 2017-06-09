package datastructures.stack.Stack;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class JavaStack {

	private Stack<Integer> myStack;
	private Stack<Integer> myReversedStack;

	private JavaStack() {
		myStack = new Stack<>();
		myReversedStack = new Stack<>();
	}

	private void getInput() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter some integers for me to reverse:");
			while (true) {
				String input = sc.next();
				if (isInt(input)) {
					int i = Integer.parseInt(input);
					if (i == -1)
						break;
					else
						myStack.push(i);
				}
			}
		} finally {
			if (sc != null)
				sc.close();
		}
	}

	private static boolean isInt(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

	private void revPrint() {
		Iterator<Integer> it = myReversedStack.iterator();
		System.out.println("Integers reversed are: ");
		while (it.hasNext()) {
			Integer i = it.next();
			if (!it.hasNext())
				System.out.print("and ");
			System.out.print(i + " ");
		}
	}

	private void reverse() {
		while (!myStack.empty()) {
			Integer i = myStack.pop();
			myReversedStack.push(i);
		}
	}

	public static void main(String[] args) {
		JavaStack st = new JavaStack();
		st.getInput();
		st.reverse();
		st.revPrint();
	}

}
