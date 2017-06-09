package lynda.essentials.strings;

public class StringParse {

    public static void main(String[] args) {
	String s1 = "Welcome to Mongolia!";
	System.out.println("Length of da string: " + s1.length());
	int pos = s1.indexOf("Mongolia");
	System.out.println("Position of Mongolia:"+pos);
	String country = s1.substring(11);
	System.out.println(country);
	String s2 = "Welcome!          ";
	int len = s2.length();
	System.out.println(len);
	String s3 = s2.trim();
	len = s3.length();
	System.out.println(s3+"--- its length is: "+len);
    }

}
