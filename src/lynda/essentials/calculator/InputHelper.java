package lynda.essentials.calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class InputHelper {
    public static String getInput(String prompt){
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
