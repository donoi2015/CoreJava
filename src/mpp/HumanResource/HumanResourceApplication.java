package mpp.HumanResource;

public class HumanResourceApplication {
	public static void main(String[] args) {
		Company company1 = new Company("Company1");
		
		Department department3 = new Department("Head department", company1);
		Department department2 = new Department("Programming department", company1);
		Department department1 = new Department("Testing department", company1);
		
		Position positionCeo = new Position("CEO", "CEO postion", department3, null);
		Position position1 = new Position("Project manager", "Project manager", department2, positionCeo);
		Position position11 = new Position("Senior developer", "Senior developer position", department2, position1);
		Position position111 = new Position("Mobile app developer", "Mobile app developer position", department2, position11);
		Position position112 = new Position("Database developer", "Database developer position", department2, position11);
		
		Position position2 = new Position("Final tester", "Final tester position", department1, positionCeo);
		Position position21 = new Position("Stress tester", "Stress tester position", department1, position2);
		Position position22 = new Position("White box tester", "White box tester position", department1, position2);
		
		Employee employee1 = new Employee("Kyle", "Korver", 80_000);
		Employee employee2 = new Employee("Allen", "Iverson", 100_000);
		Employee employee3 = new Employee("Aaron", "McKee", 75_000);
		Employee employee4 = new Employee("Dekembe", "Mutombo", 70_000);
		Employee employee5 = new Employee("Andre", "Iguodala", 70_000);

		positionCeo.setEmployee(employee2);
		position1.setEmployee(employee1);
		position11.setEmployee(employee3);
		position111.setEmployee(employee4);
		position112.setEmployee(employee5);
		
		Employee employee12 = new Employee("Michael", "Jordan", 75_000);
		Employee employee13 = new Employee("Scottie", "Pippen", 85_000);
		Employee employee14 = new Employee("Dennis", "Rodman", 95_000);
		
		position2.setEmployee(employee12);
		position21.setEmployee(employee13);
		position22.setEmployee(employee14);
		
		company1.print();
		System.out.printf("TOTAL SALARY:$%,.2f\n\n", company1.getSalary());
//		position1.printDownLine(1);
//		positionCeo.printDownLine(1);
		department3.printReportingHierarchy();
	}
}
