package mpp.HumanResource;

import java.util.ArrayList;

public class Company {
	private String name;
	private ArrayList<Department> departments;
	
	public Company() {
		departments = new ArrayList<>();
	}
	
	public Company(String name) {
		this.name = name;
		departments = new ArrayList<>();
	}

	private String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Department> getDepartments() {
		return this.departments;
	}

	public void setDepartments(ArrayList<Department> departments) {
		this.departments = departments;
	}
	public void addDepartment(Department department) {
		this.departments.add(department);
	}
	public void print() {
		System.out.println("\n------------------------------------------------------------------------------------------------");
		System.out.printf("COMPANY NAME: %s\n", this.getName());
		for(Department department : departments) {
			System.out.printf("\nDEPARTMENT NAME: %s\n", department.getName());
			department.print();
		}
		System.out.println("\n--------------------------------------------------------------------------------------------------");
	}
	
	public double getSalary() {
		double totalSalary = 0;
		for(Department department : departments) {
			totalSalary += department.getSalary();
		}
		return totalSalary;
	}
	
}
