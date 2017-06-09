package lynda.essentials.calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculator {

    public static void main(String[] args) {
	String s1 = getInput("Enter first number:");
	String s2 = getInput("Enter second number:");
	String op = getInput("Enter operation: 1=add, 2=subtract, 3=multiply, 4=divide");
	double result = 0;
	switch (op) {
	case "1":
	    result = addValues(s1,s2);
	    break;
	case "2":
	    result = subtractValues(s1,s2);
	    break;
	case "3":
	    result = multiplyValues(s1,s2);
	    break;
	case "4":
	    result = divideValues(s1,s2);
	    break;
	default:
	    System.out.println("Pls enter valid operation value");
	    break;
	}
	System.out.println("result is: " + result);
    }
    private static double addValues(String s1, String s2) throws NumberFormatException{
	double d1 = Double.parseDouble(s1);
	double d2 = Double.parseDouble(s2);
		return d1+d2;
    }
    private static double subtractValues(String s1, String s2)throws NumberFormatException{
	double d1 = Double.parseDouble(s1);
	double d2 = Double.parseDouble(s2);
		return d1-d2;
    }
    private static double multiplyValues(String s1, String s2)throws NumberFormatException{
	double d1 = Double.parseDouble(s1);
	double d2 = Double.parseDouble(s2);
		return d1*d2;
    }
    private static double divideValues(String s1, String s2)throws NumberFormatException{
	double d1 = Double.parseDouble(s1);
	double d2 = Double.parseDouble(s2);
		return d1/d2;
    }
    private static String getInput(String prompt){
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	System.out.println(prompt);
	System.out.flush();
	try {
	    return bf.readLine();
	} catch (Exception e) {
	    return "Error:"+e.getMessage();
	}
    }

}
