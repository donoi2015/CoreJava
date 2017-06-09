package recursion.simple;

import java.util.Arrays;

public class Problem4 {

	public static void main(String[] args) {
		System.out.println(findMax(new int[] { 110, 4, 15, 8, 44 }));
	}

	private static int findMax(int[] n) {
		return findMax(n, -1);
	}

	private static int findMax(int[] n, int max) {
		if (n.length == 0)
			return max;
		if (max < n[0])
			return findMax(Arrays.copyOfRange(n, 1, n.length), n[0]);
		return findMax(Arrays.copyOfRange(n, 1, n.length), max);
	}
}