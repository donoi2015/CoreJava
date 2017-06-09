package recursion.simple;

public class Problem1 {

	public static void main(String[] args) {
		System.out.println(countVowels("Alexander", 0));
	}

	private static int countVowels(String s, int k) {
		if (s.length() == 0)
			return k;
		s = s.toLowerCase();
		char ch = s.charAt(0);
		String vowels = "aoeiu";
		if (vowels.indexOf(ch) != -1)
			k++;
		return countVowels(s.substring(1), k);
	}
}