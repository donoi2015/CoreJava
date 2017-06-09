package algorithms.AlgorithmSimple;

public class BinarySearch {

	
	private static int[] numbers;
	private static int count=0;
	// O(nlog(n))
	public static void main(String[] args) {
		int[] x = new int[] { 2, 7, 11, 23, 48, 91 };
		myBS(x,2);
		int target = 91;
		int ans = 0, mid = 0, low = 0, access = 0, high = x.length;
		while (low != high) {
			mid = (low + high) / 2;
			if (x[mid] < target) {
				low = mid + 1;
			} else {
				high = mid;
			}
			access++;
			ans = x[mid];
		}
		System.out.println(ans + " at index " + mid + ", number of accesses: " + access);
	}
	
	private static void myBS(int[] arr, int target){
		numbers = arr;
		myBS(0, arr.length-1,target);
	}
	
	private static void myBS(int low, int high, int target){
		int mid = (high + low)/2;
		count++;
		if (numbers[mid]<target) myBS(mid+1,high,target);
		else if (numbers[mid]>target) myBS(low,mid-1,target);
		else System.out.println("Found it. It's at index "+mid+". searched "+count+" times");
	}
}
