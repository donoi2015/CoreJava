package regex.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTest {

	public static void main(String[] args) {
		String s1 = "Tuluvsaikhan Battulga CA IA OK IN Goo JaM 52556 AR Ar Arkansas ";
		String s2 = "134-224-4444 1-(234)-234-1124 1 (234)-234-2224";
		String s3 = "donoi2000@gmail.com Donoi2000@yahoo.com";
		String s4 = "#go dgo sam tam {{{ {{ { ";

		regexChecker("[^a-s]am",s4);
		regexChecker("[TBCIO]\\w+\\s?",s1);
		regexChecker("[a-zA-Z]{3,20}",s1);
		regexChecker("\\d{3}5",s1);
		regexChecker("\\d{2}6",s1);
		regexChecker("A[KLRZ]|C[AOT]",s1);
		regexChecker("([Aa][KLRZklrz]|[Cc][AOTaot])\\s",s1);
		regexChecker("\\{{1,}\\s",s4);
		regexChecker("[A-Za-z0-9._]+@[A-Za-z0-9._]+\\.[A-Za-z]{2,4}",s3);
		regexChecker("([0-9]( |-)?)?\\(?\\d{3}\\)?( |-)?\\d{3}( |-)?\\d{4}",s2);
		
		// employer id rule: 
		//'AS' followed by 4 digits and followed by 'USA' or 
		//'TX' followed by 3 digits and followed by 'USA' or
		//'SL' followed by 4 digits and followed by 'USA'
		Pattern idRule = Pattern.compile("(((AS|SL)\\d{4})|(TX\\d{3}))USA");
		Matcher match = idRule.matcher("AS4444USA TX333USA SL4444USA");
		while(match.find()){
			System.out.println(match.group().trim());
		}
		System.out.println("<-------pattern end-------->");
		
		//substitution
		String input = "User clientId=23421. Some more text clientId=33432. This clientNum=100";
		Pattern p = Pattern.compile("(clientId=)(\\d+)");
		Matcher m = p.matcher(input);

		StringBuffer result = new StringBuffer();
		while (m.find()) {
			System.out.println("Masking: " + m.group(2));
			m.appendReplacement(result, m.group(1) + "***masked***");
		}
		m.appendTail(result);
		System.out.println(result);
		System.out.println("<-------pattern end-------->");

		// using pattern with flags
		Pattern pattern = Pattern.compile("ab", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("ABcabdAb");
		while (matcher.find()) {
			System.out.println("Found the text \"" + matcher.group()
					+ "\" starting at " + matcher.start()
					+ " index and ending at index " + matcher.end());
		}
		// using Pattern split() method
		pattern = Pattern.compile("\\W");
		String[] words = pattern.split("one@two#three:four$five");
		for (String s : words) {
			System.out.println("Split using Pattern.split(): " + s);
		}

		// using Matcher.replaceFirst() and replaceAll() methods
		pattern = Pattern.compile("1*2");
		matcher = pattern.matcher("11234512678");
		System.out.println("Using replaceAll: " + matcher.replaceAll("_"));
		System.out.println("Using replaceFirst: " + matcher.replaceFirst("_"));
	}
	
	private static void regexChecker(String reg, String s){
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(s);
		
		while(m.find()){
			if(m.group().length()!=0){
				System.out.println(m.group().trim() + "-->  \t\tStart: " + m.start()
					+ "\tEnd:  " + m.end());
			}
		}
		System.out.println("<-------pattern end-------->");
	}
}
