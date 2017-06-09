package recursion.simple;

import java.util.Arrays;

public class Problem2 {

	public static void main(String[] args) {
		System.out.println(sum(new int[] { 1, 3, 5 }, 0, 0));
		System.out.println(sum2(new int[] { 1, 3, 4 }));
	}

	private static int sum(int[] n, int sum, int k) {
		sum += n[k];
		if (k == n.length - 1)
			return sum;
		return sum(n, sum, ++k);
	}

	private static int sum2(int[] n) {
		if (n.length == 1)
			return n[0];
		return n[0] + sum2(Arrays.copyOfRange(n, 1, n.length));
	}
}