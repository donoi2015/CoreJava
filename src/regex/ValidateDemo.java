package regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateDemo {
	public static void main(String[] args) {
		List<String> input = new ArrayList<>();
		input.add("123-45-6789");
		input.add("9876-5-4321");
		input.add("987-65-4321 (attack)");
		input.add("987-65-4321 aaaaaa");
		input.add("192-83-7465 ssssssss");
		for (String ssn : input) {
			if (ssn.matches("^\\d{3}-?\\d{2}-?\\d{4}$")) {
				System.out.println("Found good SSN: " + ssn);
			}
		}
		for (String ssn : input) {
			Pattern p = Pattern.compile("\\d{3}-?\\d{2}-?\\d{4}");
			Matcher m = p.matcher(ssn);
			StringBuffer sb = new StringBuffer();
			while (m.find()) {
				m.appendReplacement(sb, "sssssssssss");
			}
			m.appendTail(sb);
			System.out.println(sb);
		}
	}

}
