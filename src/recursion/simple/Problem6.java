package recursion.simple;

public class Problem6 {

	public static void main(String[] args) {
		System.out.println(pow(5, 3));
	}

	private static int pow(int x, int n) {
		if (n == 1)
			return x;
		return x * pow(x, --n);
	}
}