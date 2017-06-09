package algorithms.common;

import java.io.*;

public class FizzBuzz {
	public static void main(String[] args) throws IOException {
		doFizzBuzz("3 5 20");
	}

	private static void doFizzBuzz(String line) {
		StringBuilder sb = new StringBuilder();
		String[] parts = line.split(" ");
		int[] n1 = new int[parts.length];
		int first = Integer.parseInt(parts[0]);
		int second = Integer.parseInt(parts[1]);
		int count = Integer.parseInt(parts[2]);
		boolean flag;

		for (int i = 1; i < count; i++) {
			flag = true;
			if (i % first == 0) {
				flag = false;
				sb.append("F");
			}
			if (i % second == 0) {
				flag = false;
				sb.append("B");
			}
			if (flag)
				sb.append(i);
			sb.append(" ");
		}
		System.out.println(sb.toString());
	}
}
