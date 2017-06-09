package javalang.loops;

public class ForBreak {

	public static void main(String[] args) {

		for (int x = 10; x < 20; x = x + 1) {
			if (x == 15)
				break;
			System.out.print("value of x : " + x);
			System.out.print("\n");
		}
	}
}
