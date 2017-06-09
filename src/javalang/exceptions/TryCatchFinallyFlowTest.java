package javalang.exceptions;


public class TryCatchFinallyFlowTest {

	//everything in try after throwing exception in try is ignored. 
	//when both catch and finally throw exception, finally's exception is thrown. 
	//when there's no exception thrown from catch, "last statement" printed.
	private static void test(boolean throwIt) {
		try {
			if (throwIt)
				throw new Exception("thrown from try");
//			return;
//			System.exit(0);
		} catch (Exception e) {
			System.out.println(e.getMessage() + " caught in catch");

//			throw new Exception("thrown from catch"); // thrown from catch is
														// like throwing from
														// method
			// therefore this is caught in main.
		} finally {
			System.out.println("finally");
//			throw new Exception("thrown from finally");
		}
		System.out.println("last statement");
	}

	public static void main(String[] args) {
		try {
			test(true);
		} catch (Exception e) {
			System.out.println(e.getMessage() + " caught in main ");
		}
	}
}