package mpp.HumanResource;

public class Employee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String middleInitial;
	private String birthDate;
	private String ssn;
	private double salary;
	
	public Employee(String firstName, String lastName, double salary) {
		this.setLastName(lastName);
		this.setFirstName(firstName);
		this.setSalary(salary);
	}
	
	public void print() {
		System.out.printf(String.format("%s %s", this.getFirstName(), this.getLastName()));
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	private void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleInitial() {
		return middleInitial;
	}
	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public double getSalary() {
		return salary;
	}
	private void setSalary(double salary) {
		this.salary = salary;
	}
	
}
