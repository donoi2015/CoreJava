package mpp.exam;

public class IsBinary {

	public static void main(String[] args) {
		System.out.println(isBinary("000001000.000001"));
	}

	private static boolean isBinary(String s) {
		if (!isDigits(s))
			return false;
		else {
			String bin = "01.";
			for (int i = 0; i < s.length(); i++) {
				if (bin.indexOf(s.charAt(i)) == -1)
					return false;
			}
		}
		return true;
	}

	private static boolean isDigits(String s) {
		try {
			Double.parseDouble(s);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
}