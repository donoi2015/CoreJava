package javalang.enums;

import java.util.Scanner; //imports scanners

public class Calc {

	enum Op {

		ADD("a", "add", "added to"), 
		SUB("s", "subtract", "subtracted by"), 
		MUL("m", "multiply", "multiplied by"), 
		DIV("d", "divide","divided by");
		public String key;
		public String command;
		public String result;

		Op(String key, String command, String result) {
			this.key = key;
			this.command = command;
			this.result = result;
		}

		public int eval(int x, int y) {
			switch (this) {
			case ADD:
				return x + y;
			case SUB:
				return x - y;
			case MUL:
				return x * y;
			case DIV:
				return x / y;
			default:
				throw new AssertionError();
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(Op.ADD);
//		demonstrate();
	}

	public static void demonstrate(){
		while (true) // creates loop to top
		{
			System.out.println("Hello this is my calculator!");
			System.out.println("To add, type a, to subtract, type s.");
			System.out.println("To multiply, type m, to divide, type d.");

			Scanner scan = new Scanner(System.in); // sets up scanners
			Scanner scan1 = new Scanner(System.in);

			String action = scan.nextLine(); // tells comp. to take user input

			Op op = null;
			for (Op operation : Op.values()) {
				if (operation.key.equals(action)) {
					op = operation;
					break;
				}
			}

			if (op != null) {
				System.out.println("Now type in the first number you would like to "+ op.command + ".");
				int x = scan.nextInt();
				System.out.println("Now type the second number.");
				int y = scan.nextInt();
				int z = op.eval(x, y);
				System.out.println(x + " " + op.result + " " + x + " equals "+ z + "!");
			}

			System.out.println("Would you like to start over? (yes,no)");
			String startOver = scan1.nextLine();

			if ("no".equals(startOver)) {
				System.out.println("Bye");
				if(scan!=null){
					scan.close();
					scan=null;
				}
				if(scan1!=null){
					scan1.close();
					scan1=null;
				}
				break;
			}
		}
	}
}