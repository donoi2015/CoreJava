package lynda.essentials.formatting;

import java.text.NumberFormat;
import java.util.Locale;

public class NumericLiteralDemo {

    public static void main(String[] args) {
	int numberOfOlives = 1_000_0000_00; // underscore just ignored
	NumberFormat formatter = NumberFormat.getInstance();
	System.out.println(formatter.format(numberOfOlives));
	formatter = NumberFormat.getCurrencyInstance();
	System.out.println(formatter.format(numberOfOlives));
	formatter = NumberFormat.getCurrencyInstance(Locale.US);
	System.out.println(formatter.format(numberOfOlives));
	formatter = NumberFormat.getCurrencyInstance();
	System.out.println(formatter.format(numberOfOlives));
    }
}
