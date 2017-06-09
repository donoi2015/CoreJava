package datastructures.queue;

import java.util.LinkedList;
import java.util.Scanner;

public class QueueExercise2 {
	private static LinkedList<Character> queue1;
	private static LinkedList<Character> queue2;

	private QueueExercise2() {
		queue1 = new LinkedList<>();
		queue2 = new LinkedList<>();
	}

	private void readString() {
		Scanner in = new Scanner(System.in);
		int count = 0;
		String s;
		try {
			System.out.println("Enter the String : ");
			s = in.nextLine();
			for (int i = 0; i < s.length(); i++) {
				if (':' != (s.charAt(i))) {
					queue1.addFirst(s.charAt(i));
					count++;
				} else {
					break;
				}
			}
		} finally {
			if (in != null) {
				in.close();
			}
		}
		for (int i = count + 1; i < s.length(); i++) {
			queue2.addFirst(s.charAt(i));
		}
	}

	private void printQueue1() {
		for (Character aQueue1 : queue1) {
			System.out.print(aQueue1 + " ");
		}
	}

	private void printQueue2() {
		for (Character aQueue2 : queue2) {
			System.out.print(aQueue2 + " ");
		}
	}

	private String check() {
		String answer = "";
		if (queue1.isEmpty() || queue2.isEmpty()) {
			answer = "N";
		} else if (queue1.size() > queue2.size()) {
			answer = "L";
		} else if (queue1.size() < queue2.size()) {
			answer = "R";
		} else if (queue1.size() == queue2.size() && !queue1.equals(queue2)) {
			answer = "D";
		} else if (queue1.size() == queue2.size() && queue1.equals(queue2)) {
			answer = "S";
		}
		return answer;
	}

	public static void main(String[] args) {
		QueueExercise2 qq = new QueueExercise2();
		qq.readString();
		qq.printQueue1();
		System.out.println();
		qq.printQueue2();
		System.out.println();
		System.out.println(qq.check());
	}

}
