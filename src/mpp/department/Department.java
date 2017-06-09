package mpp.department;

import java.util.ArrayList;

public class Department {
	private String name;
	private ArrayList<Faculty> faculties;
	private ArrayList<Student> students;
	private ArrayList<Staff> staff;
	private ArrayList<StaffStudent> staffStudent;

	public Department(String aName) {
		name = aName;
		faculties = new ArrayList<>();
		students = new ArrayList<>();
		staff = new ArrayList<>();
		staffStudent = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addFaculty(Faculty f) {
		faculties.add(f);
	}

	public void addStudent(Student s) {
		students.add(s);
	}

	public void addStaff(Staff st) {
		staff.add(st);
	}
	public void addStaffStudent(StaffStudent ss) {
		staffStudent.add(ss);
	}

	public double getTotalSalary() {
		double total = 0;
		for (Faculty f : faculties) {
			total += f.getSalary();
		}
		for (Staff s : staff) {
			total += s.getSalary();
		}
		for (StaffStudent ss : staffStudent) {
			total += ss.getSalary();
		}
		return total;
	}

	public void showAllMembers() {
		ArrayList<Person> all = new ArrayList<>();
		all.addAll(faculties);
		all.addAll(staff);
		all.addAll(students);
		all.addAll(staffStudent);
		for (Person p : all) {
			System.out.println(p.getClass().getSimpleName() + "   name:"
					+ p.getName() + " phone: " + p.getPhone() + " age: "
					+ p.getAge());
		}
	}
	
	public void studentsOf(String s){
		System.out.println("/------------ Students of professor "+s+" ----------/");
		for (Faculty f : faculties) {
			if(f.getName().equals(s)) {
				 for (Course c : f.getTaughtCourses()) {
					 System.out.println("/------ "+c.getTitle()+" -----/");
					 for (Student st : c.getEnrolledStudents()) {
						System.out.println(st.getName());
					}
				 }
			}
		}
	}

	public int unitsPerFaculty() {
		int total = 0;
		System.out.println("<----- UNITS PER FACULTY ----->");
		for (Faculty f : faculties) {
			System.out.println(f.getName());
			total += f.getTotalUnits();
		}
		return total;
	}
}
