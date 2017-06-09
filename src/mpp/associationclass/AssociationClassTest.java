package mpp.associationclass;

import java.util.List;

public class AssociationClassTest {

	public static void main(String[] args) {
		
		Student s1 = new Student("John");
		Course c1 = new Course("Parallel programming");
		Course c2 = new Course("Enterprise Architecture");
		Transcript t1 = new Transcript(c1, s1, 4.0);
		Transcript t2 = new Transcript(c2, s1, 4.0);
		printCourses(s1);
	}
	private static void printCourses(Student s){
		List<Transcript> john_transcripts = s.getTranscripts();
		john_transcripts.forEach(t-> System.out.println(t.getCourse()+" "+t.getGrade()));
	}
}
