package algorithms.AlgorithmSimple;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class KnapsackBruteForceOptimization {
	/**
	 * 
	 * @param W - positive integer
	 * @param V - positive integer
	 * @param w - int array of n pos integers
	 * @param v - int array of n pos integers
	 * @return max value subject to constraint that sum of weights <= W
	 */
	private static int knapsack(int[] w, int[] v, int W) {
		int n = w.length;
		int maxSoFar = 0;
		Set<Integer> optimalSubset = null;
		
		List<Integer> setOfIndices = new ArrayList<>();
		//create the set whose subsets we will examine
		for(int i = 0; i < n; ++i) {
			setOfIndices.add(i);
		}
		List<Set<Integer>> subsets = PowerSet.powerSet(setOfIndices);
		for(Set<Integer> subset : subsets) {
			int newTotalWeight = sum(w,subset);
			int newTotalBenefit = sum(v,subset);
			if(newTotalWeight <= W && sum(v,subset) > maxSoFar) {
				maxSoFar = newTotalBenefit;
				optimalSubset = subset;
			}

		}
		//could return optimalSubset instead
		return maxSoFar;
		
	}
	
	private static int sum(int[] arr, Set<Integer> subset) {
		int accum = 0;
		for(int i : subset) {
			accum += arr[i];
		}
		return accum;
	}
	public static void main(String[] args) {
		KnapsackBruteForceOptimization kb = new KnapsackBruteForceOptimization();
		//int[] w = {2,3,4,5,7,9,11,13,12};
		//int[] v = {1,6,3,4,2,5,4,2,1};
		//int W = 18;
		int[] w = {2, 3, 4, 5};
		int[] v = {1, 2, 3, 4};
		int W = 5;
		System.out.println(kb.knapsack(w, v, W));
		
	}
	
}
