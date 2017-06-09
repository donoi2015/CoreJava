package lynda.essentials.calculator;

public class CopyOfCalculator {

    public static void main(String[] args) {
	String s1 = InputHelper.getInput("Enter first number:");
	String s2 = InputHelper.getInput("Enter second number:");
	String op = InputHelper.getInput("Enter operation: 1=add, 2=subtract, 3=multiply, 4=divide");
	double result = 0;
	switch (op) {
	case "1":
	    result = MathHelper.addValues(s1,s2);
	    break;
	case "2":
	    result = MathHelper.subtractValues(s1,s2);
	    break;
	case "3":
	    result = MathHelper.multiplyValues(s1,s2);
	    break;
	case "4":
	    result = MathHelper.divideValues(s1,s2);
	    break;
	default:
	    System.out.println("Pls enter valid operation value");
	    break;
	}
	System.out.println("result is: " + result);
    }
}
