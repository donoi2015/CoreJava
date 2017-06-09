package regex.validation;
import javax.swing.*;

class EmailValidator {
	private static final String STOP = "STOP";
	private static final String VALID = "Valid Java identifier";
	private static final String INVALID = "Not a valid Java identifier";

	private static final String 
	VALID_EMAIL_PATTERN = "\\w{3}\\w*@[a-zA-Z]{3,10}.[a-zA-z]{2,5}";

	public static void main(String[] args) {
		String str, reply;
		while (true) {
			str = JOptionPane.showInputDialog(null, "Identifier:");

			if (str.equals(STOP))
				break;
			if (str.matches(VALID_EMAIL_PATTERN)) {
				reply = VALID;
			} else {
				reply = INVALID;
			}
			JOptionPane.showMessageDialog(null, str + " :\n" + reply);
		}
	}
}