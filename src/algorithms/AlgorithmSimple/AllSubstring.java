package algorithms.AlgorithmSimple;

public class AllSubstring {

	private static void printCombinations(String initial, String combined) {
		System.out.println(combined);
		for (int i = 0; i < initial.length(); i++) {
			printCombinations(initial.substring(1 + i),
					combined + initial.charAt(i));
		}
	}

	public static void main(String[] args) {
		printCombinations("love", "");
	}

}