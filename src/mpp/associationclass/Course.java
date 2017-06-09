package mpp.associationclass;

import java.util.HashSet;
import java.util.Set;

public class Course {
	private Set<Transcript> transcripts;
	private Set<Student> students;
	private String title;

	public Course(String aTitle) {
		title = aTitle;
		students = new HashSet<>();
		transcripts = new HashSet<>();
	}
	public void addTranscript(Transcript t) {
		transcripts.add(t);
	}
	public void addStudent(Student s){
		students.add(s);
	}

	public Set<Transcript> getTranscripts() {
		return transcripts;
	}
	@Override
	public String toString() {
		return title;
	}
	
	
}
