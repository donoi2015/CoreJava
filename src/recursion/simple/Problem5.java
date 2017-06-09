package recursion.simple;

import java.util.Arrays;

public class Problem5 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(reverseArray(new int[] { 1, 2, 3, 4,	5 })));
	}

	private static int[] reverseArray(int[] n) {
		int len = n.length;
		int[] k = new int[len];
		return reverseArray(n, k, 0);
	}

	private static int[] reverseArray(int[] n, int[] k, int index) {
		k[index] = n[n.length - index - 1];
		if (index == n.length - 1)
			return k;
		return reverseArray(n, k, ++index);
	}
}