package algorithms.common;

public class ParenthesisCheck {

	private static String open = "([{";
	private static String close = ")]}";

	private static boolean isOpen(char ch) {
		return open.indexOf(ch) != -1;
	}

	private static boolean isClose(char ch) {
		return close.indexOf(ch) != -1;
	}

	private static boolean isMatching(char chOpen, char chClose) {
		return open.indexOf(chOpen) == close.indexOf(chClose);
	}

	private static boolean isBalanced(String input, String stack) {
        if (input.isEmpty()) {
            return stack.isEmpty();
        } else {
            if (isClose(input.charAt(0))) {
                if (isOpen(input.charAt(0))) {
                    return isBalanced(input.substring(1), input.charAt(0) + stack);
                } else {
                    return !stack.isEmpty() && isMatching(stack.charAt(0), input.charAt(0)) && isBalanced(input.substring(1), stack.substring(1));
                }
            } else {
                if (isOpen(input.charAt(0))) {
                    return isBalanced(input.substring(1), input.charAt(0) + stack);
                } else {
                    return isBalanced(input.substring(1), stack);
                }
            }
        }
	}

	public static void main(String[] args) {
		String[] tests = { "()[]<>{}", "(<", "]}", "()<", "(][)", "{(X)[XY]}",
				"][", "(a + b[(x+y)] + 10)" };
		for (String s : tests) {
			System.out.println(s + " = " + isBalanced(s, ""));
		}
//        Scanner sc = new Scanner(System.in);
//        System.out.println(isBalanced(sc.nextLine(),""));
    }

}
