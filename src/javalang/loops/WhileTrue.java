package javalang.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileTrue {

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String line;

	while ((line = br.readLine()) != null && !line.equals("quit")) {
	    System.out.println("So "+ line + " is your input, huh...");
	}
    }
}
