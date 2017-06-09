package sort;

import java.util.Arrays;

public class MergeSort2 {

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 35, 6, 77, 12 };
		System.out.println(Arrays.toString(sort(a)));
	}

	private static int[] sort(int[] s) {
		if (s.length <= 1) {
			return s;
		}
		
		int[] first = new int[s.length / 2];
		int[] second = new int[s.length - first.length];

		System.arraycopy(s, 0, first, 0, first.length);
		System.arraycopy(s, first.length, second, 0, second.length);

		sort(first);
		sort(second);

		merge(first, second, s);
		return s;
	}

	private static void merge(int[] first, int[] second, int[] result) {
		int i = 0, j = 0, k = 0;
		while (i < first.length && j < second.length) {
			if (first[i] < second[j])
				result[k] = first[i++];
			else
				result[k] = second[j++];
			k++;
		}

		System.arraycopy(first, i, result, k, first.length - i);
		System.arraycopy(second, j, result, k, second.length - j);

	}

}
