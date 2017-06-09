package lynda.advanced.TestingandException.calculator;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Calculator {

    public static void main(String[] args) {
        while (true) {
            double s1 = InputHelper.getDouble("Enter first number:");
            double s2 = InputHelper.getDouble("Enter second number:");
            String op = InputHelper.getOp("Enter operation: +, -, *, /");
            double result = 0;
            switch (op) {
                case "+":
                    result = s1 + s2;
                    break;
                case "-":
                    result = s1 - s2;
                    break;
                case "*":
                    result = s1 * s2;
                    break;
                case "/":
                    result = s1 / s2;
                    break;
            }
            NumberFormat nf = new DecimalFormat("##.###");
            System.out.println("result is: " + nf.format(result));
            String repeat = InputHelper
                    .getInput("Would you like to repeat? (yes/no)");
            if (repeat.equals("no")) {
                System.out.println("Goodbye!");
                return;
            }
        }
    }
}
