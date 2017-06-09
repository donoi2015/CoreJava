package recursion.simple;

public class Problem3 {

	public static void main(String[] args) {
		patternize(6);
	}

	private static void patternize(int n) {
		patternize(n, n, -1);
	}

	private static void patternize(int n, int k, int j) {
		if (n == 0) {
			j = 1;
		} else {
			for (int i = 0; i < n; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		if (j == 1 && n == k)
			return;
		patternize(n + j, k, j);
	}
}