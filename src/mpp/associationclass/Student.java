package mpp.associationclass;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private List<Transcript> transcripts;
	private List<Course> courses;
	private String name;

	public Student(String aName) {
		name = aName;
		courses = new ArrayList<>();
		transcripts = new ArrayList<>();
	}

	public void addTranscript(Transcript t) {
		transcripts.add(t);
	}
	public void addCourse(Course c){
		courses.add(c);
	}

	public List<Transcript> getTranscripts(){
		return transcripts;
	}
	@Override
	public String toString() {
		return name;
	}
}
