package mpp.department;

import java.util.ArrayList;

class Student extends Person {
	private double GPA;
	private ArrayList<Course> registeredCourses;
	public Student(String name, String phone, int age, double gpa, Department dept){
		this.name = name;
		this.phone = phone;
		this.age = age;
		this.dept = dept;
		dept.addStudent(this);
		GPA = gpa;
		registeredCourses = new ArrayList<>();
	}
	public double getGpa() {
		return GPA;
	}
	public void setGpa(double gpa) {
		GPA = gpa;
	}
	public void registerCourse(Course c){
		registeredCourses.add(c);
		c.add(this);
	}
	public double getTotalUnits(){
		double totalUnits=0;
		for (Course c : registeredCourses) {
			totalUnits+=c.getUnits();
		}
		return totalUnits;
	}
}
