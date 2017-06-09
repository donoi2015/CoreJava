package mpp.department;

public class StaffStudent extends Student {
	
	private double salary;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public StaffStudent(String name, String phone, int age, double salary,Course c,Department dept) {
		super(name, phone, age, 0.0, dept);
		this.salary = salary;
		super.registerCourse(c);
	}
}