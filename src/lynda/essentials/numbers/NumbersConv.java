package lynda.essentials.numbers;

public class NumbersConv {

    public static void main(String[] args) {
	int x = 3;
	System.out.println(++x); // add one (3+1=4)then print
	System.out.println(x++); // print (4) then add (4+1=5)
	System.out.println(x);

	/*
	 * Conversion : 
	 * byte -128:+127, 
	 * 8 bit short, 
	 * 16 bit int, 
	 * 32 bit long, 
	 * 64 bit 0L 
	 * float, 0.0f Never use for precise values such as currency.
	 * Math.BigDecimal for that. 
	 * double 0.0d 
	 * char, 16 bit Unicode character
	 */

	// Casting
	int y = 128;
	long l = (long) y;
	double d = (double) l;
	System.out.println("Int: " + y + " Long: " + l + " Double: " + d);
	byte b = (byte) y;
	System.out.println("Int:" + y + " to Byte: " + b);

	double dou = 3.99;
	int in = (int) dou;
	System.out.println("Double: 3.99 to int: " + in);

	// Decimal, Hexadecimal, Binary

	// The number 26, in decimal
	int decVal = 26;
	// The number 26, in hexadecimal : 0123456789 abcdef
	int hexVal = 0x1a;
	// The number 26, in binary
	int binVal = 0b11010;

	System.out.println("decimal:" + decVal + " hexadecimal:" + hexVal
		+ " binary:" + binVal);

	String s = "Wow, T\b This is not cool. \t However.\n you may call me \"The Monster\"or \'slick\' or \\";
	System.out.println(s);

	int BLACK = 0x00_00_00;
	int WHITE = 0xFF_FF_FF;
    }

}
