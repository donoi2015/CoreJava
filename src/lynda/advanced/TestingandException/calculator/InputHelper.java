package lynda.advanced.TestingandException.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputHelper {
    public static String getInput(String prompt) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(prompt);
        System.out.flush();
        try {
            return bf.readLine();
        } catch (IOException e) {
            return "Error:" + e.getMessage();
        }
    }

    public static double getDouble(String prompt) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(prompt);
        System.out.flush();
        double answer;
        do {
            try {
                answer = Double.parseDouble(bf.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Pls enter a double value.");
            } catch (NullPointerException e) {
                System.out.println("Pls enter some value.");
            } catch (IOException e) {
                System.out.println("Connection error.");
            }
        } while (true);
        return answer;
    }

    public static String getOp(String prompt) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(prompt);
        System.out.flush();
        String op;
        do {
            try {
                op = bf.readLine();
                switch (op) {
                    case "+":
                        return op;
                    case "-":
                        return op;
                    case "*":
                        return op;
                    case "/":
                        return op;
                    default:
                        System.out.println("Pls enter valid operation value");
                }
            } catch (Exception e) {
                System.out.println("I/O error occurred:\n" + e.getMessage());
            }
        } while (true);
    }

}
