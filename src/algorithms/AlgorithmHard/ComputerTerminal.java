package algorithms.AlgorithmHard;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ComputerTerminal {
	private static Screen myScreen = new Screen();

	public static void main(String[] args) {
		Path source = Paths.get("input.txt");
		Charset charset = Charset.defaultCharset();

		try (BufferedReader br = Files.newBufferedReader(source, charset)) {
			String line = null;
			while ((line = br.readLine()) != null) {
				line = line.trim();
				terminal(line);
			}
			myScreen.output();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void terminal(String line) {
		String myPattern = "\\^([chbdulreio\\^]|\\d{2})";
		Pattern control_pattern = Pattern.compile(myPattern);
		String[] normalStrings = line.split(myPattern);
		Matcher m = control_pattern.matcher(line);

		// if all commands, no strings, do commands
		if (normalStrings.length == 0) {
			while (m.find()) {
				command(m.group());
			}
			// if commands and strings are mixed, loop through strings and do
			// commands
		} else {
			for (int l = 0; l < normalStrings.length; l++) {
				if (l < normalStrings.length && l != 0) {
					m.find();
					command(m.group());
				}
				myScreen.assign(normalStrings[l]);
			}
		}
	}

	private static void command(String line) {
		switch (line) {
		case "":
			break;
		case "^c":
			myScreen.clear();
			break;
		case "^h":
			myScreen.moveToHead();
			break;
		case "^d":
			myScreen.moveDown();
			break;
		case "^u":
			myScreen.moveUp();
			break;
		case "^l":
			myScreen.moveLeft();
			break;
		case "^r":
			myScreen.moveRight();
			break;
		case "^e":
			myScreen.erase();
			break;
		case "^i":
			myScreen.insertMode();
			break;
		case "^o":
			myScreen.overwriteMode();
			break;
		case "^b":
			myScreen.moveBeginning();
			break;
		case "^^":
			myScreen.circumflex();
			break;

		default:
			if (line.matches("\\^\\d{2}")) {
				myScreen.goTo(line.charAt(1), line.charAt(2));
			}
			break;
		}
	}

	static class Screen {
		boolean overwrite = true;
		// cursor position: i = row, j = column
		int i = 0, j = 0;
		char[][] screen = new char[10][10];

		void assign(String str) {
			int len = (str.length() < 10) ? str.length() : 9;
			if (!overwrite) {
				shift(j, len);
			}
			for (int i = 0; i < str.length(); i++) {
				screen[this.i][j] = str.charAt(i);
				moveRight();
			}
		}

		void shift(int from, int by) {
			for (int i = 9; i - by >= from; i--) {
				screen[this.i][i] = screen[this.i][i - by];
			}
		}

		void clear() {
			for (int k = 0; k < 10; k++) {
				for (int m = 0; m < 10; m++) {
					screen[k][m] = ' ';
				}
			}
		}

		void moveToHead() {
			i = 0;
			j = 0;
		}

		void moveDown() {
			if (i < 9)
				i++;
		}

		void moveUp() {
			if (i > 0)
				i--;
		}

		void moveLeft() {
			if (j > 0)
				j--;
		}

		void moveRight() {
			if (j < 9)
				j++;
		}

		void erase() {
			for (int runner = j; runner < 10; runner++) {
				screen[i][runner] = ' ';
			}
		}

		void insertMode() {
			overwrite = false;
		}

		void overwriteMode() {
			overwrite = true;
		}

		void moveBeginning() {
			j = 0;
		}

		void circumflex() {
			assign("^");
		}

		void goTo(char row, char column) {
			i = Character.getNumericValue(row);
			j = Character.getNumericValue(column);
		}

		void output() {
			StringBuilder sb = new StringBuilder();

			for (int k = 0; k < 10; k++) {
				for (int m = 0; m < 10; m++) {
					sb.append(screen[k][m]);
				}
				sb.append(System.getProperty("line.separator"));
			}
			System.out.println(sb.toString());
		}
	}
}
