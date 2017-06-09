package mpp.department;

import java.io.BufferedReader;
import java.io.IOException; 
import java.io.InputStreamReader;

public class DepartmentApplication {
	public static void main(String[] args) throws IOException {
		Department dept = new Department("ComputerScience");

		Faculty frankMoore = new Faculty("Frank Moore", "472-5921", 43, 10000, dept);
		Faculty samHoward = new Faculty("Sam Howard", "472-7222", 55, 9500, dept);
		Faculty johnDoodle = new Faculty("John Doodle", "472-6190", 39, 8600, dept);

		Student johnDoe = new Student("John Doe", "472-1121", 22, 4.0, dept);
		Student maryJones = new Student("Mary Jones", "472-7322", 32, 3.80, dept);
		Student leeJohnson = new Student("Lee Johnson", "472-6009", 19, 3.65, dept);

		Staff frankGore = new Staff("Frank Gore", "472-3321", 33, 4050, dept);
		Staff adamDavis = new Staff("Adam Davis", "472-7552", 50, 5500, dept);
		Staff davidHeck = new Staff("David Heck", "472-8890", 29, 3600, dept);
		

		Course cs201 = new Course("cs201", "programming", 4, johnDoodle);
		Course cs360 = new Course("cs360", "database", 3, samHoward);
		Course cs404 = new Course("cs404", "compiler", 4, johnDoodle);
		Course cs240 = new Course("cs240", "datastructure", 2, johnDoodle);
		Course cs301 = new Course("cs301", "Software engg", 3, samHoward);
		Course cs450 = new Course("cs450", "Advanced architecture", 5,frankMoore);

		StaffStudent frank = frankGore.takeCourse(cs201);
		frank.registerCourse(cs450);
		
		johnDoe.registerCourse(cs201);
		johnDoe.registerCourse(cs360);
		johnDoe.registerCourse(cs404);
		johnDoe.registerCourse(cs301);
		maryJones.registerCourse(cs201);
		maryJones.registerCourse(cs404);
		maryJones.registerCourse(cs450);
		leeJohnson.registerCourse(cs201);
		leeJohnson.registerCourse(cs360);
		leeJohnson.registerCourse(cs240);
		leeJohnson.registerCourse(cs450);
		
		/********************************************************/

		double totsalary = 0;

		while (true) {
			putText("Enter first letter of ");
			putText("getTotalSalary, showAllMembers, unitsPerFaculty, faculty's students or quit : ");
			int choice = getChar();
			switch (choice) {
			case 'g':
				totsalary = dept.getTotalSalary();
				putText("Total sum of all salaries is:");
				putText(String.valueOf(totsalary) + "\n");
				break;
			case 's':
				dept.showAllMembers();
				break;
			case 'u':
				System.out.println(dept.unitsPerFaculty());
				break;
			case 'f':
				putText("Choose faculty memeber: ");
				String fName = getString();
				dept.studentsOf(fName);
				break;
			case 'q':
				return;
			default:
				putText("Invalid entry\n");
			} // end switch
		} // end while
	} // end main()
		// -------------------------------------------------------------

	private static void putText(String s) // writes string s to the screen
	{
		System.out.println(s);
	}

	// -------------------------------------------------------------
	private static String getString() throws IOException // reads a string from
														// the keyboard input
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
	}

	// -------------------------------------------------------------
	private static char getChar() throws IOException // reads a character from
													// the keyboard input
	{
		String s = getString();
		return s.charAt(0);
	}

	// -------------------------------------------------------------
	public static int getInt() throws IOException // reads an integers from the
													// keyboard input
	{
		String s = getString();
		return Integer.parseInt(s);
	}
	// -------------------------------------------------------------
} // end class

