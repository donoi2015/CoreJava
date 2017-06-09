package recursion;

public class CommonRecursions {

	public static void main(String[] args) {
		System.out.println(Sum(6));
		System.out.println(fibo(6));
		System.out.println(fibo2(6));
		System.out.println(fact(4));
		System.out.println(isPalindrome("abcdedcba"));
	}

	private static int Sum(int n) {
		if (n == 1)
			return 1;
		return Sum(n - 1) + n;
	}

	private static int fact(int n) {
		if (n == 0)
			return 1;
		return fact(n - 1) * n;
	}

	private static int fibo(int n) {
		if (n < 2)
			return n;
		return fibo(n - 1) + fibo(n - 2);
	}

	private static int fibo2(int n) {
		int a1 = 0, a2 = 1;
		for (int i = 0; i < n; i++) {
			int temp = a1;
			a1 = a1 + a2;
			a2 = temp;
		}
		return a1;
	}

	private static boolean isPalindrome(String s) {
		int k = s.length() - 1;
		if (k == 1 || k == 0)
			return true;
		return s.substring(0, 1).equals(s.substring(k)) && isPalindrome(s.substring(1, k));
	}
}