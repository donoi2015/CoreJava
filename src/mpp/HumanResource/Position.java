package mpp.HumanResource;

import java.util.ArrayList;

public class Position {
	private String title;
	private String description;
	private Department department;
	private Employee employee;
	private Position superior;
	private ArrayList<Position> inferiors;
	
	public Position() {
		department = new Department();
	}
	
	public Position(String title, String description, Department department, Position superior) {
		this.setTitle(title);
		this.setDescription(description);
		this.setDepartment(department);
		department.addPosition(this);
		inferiors = new ArrayList<>();
		if(superior == null)
			return;
		this.setSuperior(superior);
		superior.addInferior(this);
	}
	
	public Position getSuperior() {
		return superior;
	}

	private void setSuperior(Position superior) {
		this.superior = superior;
	}

	public void print() {
		if(this.employee != null)
			this.employee.print();
		else
			System.out.println("None");
	}
	
	public double getSalary() {
		if (employee == null) return 0;
		return employee.getSalary();
	}
	
	public void printDownLine(int level) {
		for(int i=0;i<level;i++) {
			System.out.print("  "); 
		}
		System.out.printf("%s /%s/\n", this.getEmployee().getLastName(), this.getTitle());
		level = (this.inferiors.size() == 0) ? 1 : level + 1;
		
		for(Position position : inferiors) {
			position.printDownLine(level);
		}
	}
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		if(this.employee == null)
			this.employee = employee;
		else
			System.out.println(" This position has already filled ");
	}
	
	private void addInferior(Position inferior) {
		this.inferiors.add(inferior);
	}

	public String getTitle() {
		return title;
	}
	private void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	private void setDescription(String description) {
		this.description = description;
	}
	public Department getDepartment() {
		return department;
	}
	private void setDepartment(Department department) {
		this.department = department;
	}
}
