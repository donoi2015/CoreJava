package sort;

public class insertionsort {

	public static void main(String[] args) {
		int[] inp = new int[] { 3, 5, 10, 1, 12, 4, 6 };
		sort(inp);
        for (int anInp : inp) {
            System.out.print(anInp + " ");
        }
	}

	private static void sort(int[] a) {
		int n = a.length;
		for (int i = 1; i < n; i++) {
			int cur = a[i];
			int prev = i - 1;
			while ((prev >= 0) && (a[prev] > cur))
				a[prev + 1] = a[prev--];
			a[prev + 1] = cur;
		}
	}
}