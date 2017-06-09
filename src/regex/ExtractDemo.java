package regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDemo {
	public static void main(String[] args) {
		String input = "I have a cat, but I like my dog better. I am a human and afraid with wolf";
		Pattern p = Pattern.compile("(mouse|cat|dog|wolf|bear)");
		Matcher m = p.matcher(input);

		List<String> animals = new ArrayList<>();
		while (m.find()) {
			System.out.println("Found a " + m.group() + ".");
			animals.add(m.group());
		}
	}
}
