package lynda.essentials.strings;

public class StringsEqualsTest {

    public static void main(String[] args) {
	String s1 = "Welcome to UB!";
	String s2 = new String("Welcome to UB!");
	String s3 = "Welcome to UB!";
	String s4 = "welcome to ub!";
	System.out.println("s1 = \""+s1+"\"");
	System.out.println("s2 = new String(\""+s2+"\")");
	System.out.println("s3 = \""+s3+"\"");
	System.out.println("s4 = \""+s4+"\"");
	if(s1==s2){
	    System.out.println("s1 and s2 match with ==");
	} else{
	    System.out.println("s1 and s2 don't match with ==");
	}
	if(s1.equals(s2)){
	    System.out.println("s1 and s2 match with .equals() operator");
	}else {
	    System.out.println("s1 and s2 don't match with .equals() operator");
	}
	if(s1==s3){
	    System.out.println("s1 and s3 match with ==");
	} else{
	    System.out.println("s1 and s3 don't match with ==");
	}
	if(s1.equals(s3)){
	    System.out.println("s1 and s3 match with .equals() operator");
	}else {
	    System.out.println("s1 and s3 don't match with .equals() operator");
	}
	if (s1.equalsIgnoreCase(s4)) {
	    System.out.println("s1 and s4 match with equalsIgnoreCase() operator");
	}
	if(s1==s4){
	    System.out.println("s1 and s4 match with ==");
	} else {
	    System.out.println("s1 and s4 don't match with ==");
	}
    }

}
