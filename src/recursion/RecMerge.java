package recursion;

import java.util.Arrays;

public class RecMerge {

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7, 9, 11, 13 };
		int[] arr2 = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		int[] result = Merge(arr1, arr2);
		System.out.println(Arrays.toString(result));
	}
	
	/**
	 * Merge two arrays?
	 * 
	 * 
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	private static int[] Merge(int[] arr1, int[] arr2) {
		if (arr1 == null)
			return arr2;
		if (arr2 == null)
			return arr1;
		int[] arrRet = new int[arr1.length + arr2.length];
		return recursiveMerge(arrRet, 0, arr1, arr2);
	}

	private static int[] recursiveMerge(int[] arrRet, int k, int[] arr1,
										int[] arr2) {
		if (arr1.length == 0) {
			for (int i = 0; i < arr2.length; i++) {
				arrRet[arrRet.length - arr2.length + i] = arr2[i];
			}
			return arrRet;
		}
		if (arr2.length == 0) {
			for (int i = 0; i < arr1.length; i++) {
				arrRet[arrRet.length - arr1.length + i] = arr1[i];
			}
			return arrRet;
		}

		if (arr1[0] < arr2[0]) {
			arrRet[k++] = arr1[0];
			return recursiveMerge(arrRet, k,
					Arrays.copyOfRange(arr1, 1, arr1.length), arr2);
		} else {
			arrRet[k++] = arr2[0];
			return recursiveMerge(arrRet, k, arr1,
					Arrays.copyOfRange(arr2, 1, arr2.length));
		}

	}
}
