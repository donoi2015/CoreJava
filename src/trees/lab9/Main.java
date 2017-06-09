package trees.lab9;

public class Main {

	public static void main(String[] args) {
		EmployeeBST bst = new EmployeeBST();
		loadEmployees(bst);
		testClosestTo(bst);
		testExtractRange(bst);
		testBST(bst);
	}
	private static void testBST(EmployeeBST bst) {
		System.out.println("==========================");
		System.out.println("Printing the Whole Tree...");
		System.out.println("-------------------------------------------");
		bst.printTree();
	}
	private static void testClosestTo(EmployeeBST bst) {
		System.out.println("==========================");
		System.out.println("Testing Closest To Methods...");
		System.out.println("-------------------------------------------");
		
		System.out.println("Smallest greater than 50,000: " + bst.smallestSalaryGreaterThanEqual(50000));
		System.out.println("Largest smaller than 71,000: " + bst.largestSalaryLessThanEqual(71000));
		System.out.println("Smallest greater than 120,000: " + bst.smallestSalaryGreaterThanEqual(120000));
		System.out.println("Largest smaller than 20,000: " + bst.largestSalaryLessThanEqual(20000)+"\n");
		System.out.println("Closest to 66000:\n  " + bst.closestTo(66000) + "\n");
		System.out.println("Closest to 120,000:\n  " +  bst.closestTo(120000)+ "\n");
		System.out.println("Closest to 20,000:\n  " +  bst.closestTo(20000)+ "\n");
	}
	private static void testExtractRange(EmployeeBST bst) {
		System.out.println("==========================");
		System.out.println("Testing Extract Range Methods...");
		System.out.println("-------------------------------------------");
		System.out.println("Range from $65,000 to $75,000:");
		bst.printRange(65000, 75000);
		System.out.println("\nAlt computation of range from $65,000 to $75,000:");
		bst.altPrintRange(65000, 75000);
	}
	
	private static String newString(int j) {
		char[] fourLetrs = new char[4];
		for(int i = 0; i < 3; ++i) {
			fourLetrs[i] = (char)RandomNumbers.getRandomInt(97, 122);
		}
		fourLetrs[3] = (char)(97+j);
		
		return new String(fourLetrs);
	}
	
	private static void loadEmployees(EmployeeBST bst) {
		
		Employee e = new Employee("John", 51000, 10, 5, 1);
		bst.insert(e);
		e = new Employee("Ralph", 48000, 1,1,3);
		bst.insert(e);
		e = new Employee("Jim", 51000, 8, 5, 2);
		bst.insert(e);
		e = new Employee("Tom", 40000, 3,3,3);
		bst.insert(e);
		e = new Employee("Dave", 45000, 2,2,2);
		bst.insert(e);
		e = new Employee("Jan", 51000, 8, 4, 2);
		bst.insert(e);
		e = new Employee("Frank", 48000, 1,11,5);
		bst.insert(e);
		
		
		e = new Employee("Annie", 65000, 2,2,2);
		bst.insert(e);
		e = new Employee("Arnie", 55000, 8, 4, 2);
		bst.insert(e);
		e = new Employee("Rich", 70000, 1,11,5);
		bst.insert(e);
		
		for(int i = 0; i < 20; ++i) {
			int month = RandomNumbers.getRandomInt(1,11);
			int day = RandomNumbers.getRandomInt(1,28);
			int year = RandomNumbers.getRandomInt(1970, 2014);
			int next = 100*RandomNumbers.getRandomInt(1,500);
			int loopSize = RandomNumbers.getRandomInt(1,4);
			for(int j = 0; j < loopSize; ++j) {
				e = new Employee("Jan" + newString(j), 25000+next, month, day, year);
				bst.insert(e);
			}
		}
	}

}
