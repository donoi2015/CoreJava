package mpp.associationclass;

class Transcript {
	private Course course;
	private Student student;
	private double grade;

	public Transcript(Course aCourse, Student aStudent, double aGrade) {
		course = aCourse;
		student = aStudent;
		grade = aGrade;
		course.addTranscript(this);
		course.addStudent(aStudent);
		student.addTranscript(this);
		student.addCourse(aCourse);
	}

	public Course getCourse() {
		return course;
	}

	public Student getStudent() {
		return student;
	}

	public double getGrade() {
		return grade;
	}
}