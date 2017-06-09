package mpp.department;

import java.util.ArrayList;


public class Faculty extends Person {
	private double Salary;
	private ArrayList<Course> taughtCourses;
	public Faculty(String name, String phone, int age, double salary, Department dept){
		taughtCourses = new ArrayList<>();
		this.name = name;
		this.phone = phone;
		this.age = age;
		Salary = salary;
		this.dept = dept;
		dept.addFaculty(this);
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public ArrayList<Course> getTaughtCourses() {
		return taughtCourses;
	}
	public void addCourse(Course c){
		taughtCourses.add(c);
	}
	public double getTotalUnits(){
		double totalUnits=0;
		for (Course c : taughtCourses) {
			totalUnits+=c.getUnits();
		}
		return totalUnits;
	}
}
