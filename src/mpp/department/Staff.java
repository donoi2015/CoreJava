package mpp.department;


class Staff extends Person {
	private double Salary;
	public Staff(String name, String phone, int age, double salary, Department dept){
		this.name = name;
		this.phone = phone;
		this.age = age;
		this.dept = dept;
		dept.addStaff(this);
		Salary = salary;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public StaffStudent takeCourse(Course c){
        return new StaffStudent(name, phone, age, Salary, c,dept);
	}
	
}
