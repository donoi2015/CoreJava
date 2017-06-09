package algorithms.common;

public class BeautifulNumber {

	public static void main(String[] args) {
		getBeautifulNumber("ABbCcc");
		getBeautifulNumber("AaB");
	}

	private static void getBeautifulNumber(String line) {
		line = line.toLowerCase();
		int[] arr = new int[256];

		for (String s : line.split(" ")) {
			for (char c : s.toCharArray()) {
				if (Character.isLetter(c))
					arr[c]++;
			}
		}
		int num = 0;
		for (int i = 0; i < 256; i++) {
			if (arr[i] > 0)
				num++;
		}
		int max = 0;
		int maxInd = 0;
		int beauty = 0;
		int letterBeauty = 26;
		for (int j = 0; j < num; j++) {
			for (int i = 0; i < 256; i++) {
				if (arr[i] > max) {
					max = arr[i];
					maxInd = i;
				}
			}
			beauty += letterBeauty * max;
			letterBeauty--;
			arr[maxInd] = 0;
			max=0;
		}
		System.out.println(beauty);
	}
}
