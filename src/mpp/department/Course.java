package mpp.department;

import java.util.ArrayList;

class Course {
	private String number;
	private String title;
	private int units;
	private Faculty teachingProfessor;
	private ArrayList<Student> enrolledStudents;

	public ArrayList<Student> getEnrolledStudents() {
		return enrolledStudents;
	}
	public Course(String number, String title, int units, Faculty f) {
		this.number = number;
		this.title = title;
		this.units = units;
		teachingProfessor = f;
		f.addCourse(this);
		enrolledStudents = new ArrayList<>();
	}
	public void add(Student s){
		enrolledStudents.add(s);
	}
	public Faculty getTeachingProfessor() {
		return teachingProfessor;
	}

	public void setTeachingProfessor(Faculty teachingProfessor) {
		this.teachingProfessor = teachingProfessor;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}
}
