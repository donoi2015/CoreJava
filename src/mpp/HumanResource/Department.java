package mpp.HumanResource;

import java.util.ArrayList;

public class Department {

	private String name;
	private String location;
	
	private ArrayList<Position> positions;
	private Company company;
	private Position ceo;
	
	public Department() {
		positions = new ArrayList<>();
		company = new Company();
		System.out.println("asdasdasd");
	}
	
	public Department(String name, Company company) {
		positions = new ArrayList<>();
		setName(name);
		setCompany(company);
		company.addDepartment(this);
	}
	
	public void printReportingHierarchy() {
		getDepartmentHead().printDownLine(1);
		System.out.printf("Executive director is : %s %s", this.getCeo().getEmployee().getFirstName(), this.getCeo().getEmployee().getLastName());
	}
	
	private Position getDepartmentHead() {
		for(Position position: positions) {
			if(position.getSuperior() == null) {
				this.setCeo(position);
				return position;
			}
			if(!positions.contains(position.getSuperior())) {
				ceo = position.getSuperior();
				return position;
			}
		}
		
		System.out.println(" There is no head in this department ");
		return null;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null) return false;
		Department departmentObj = (Department)obj;
		return (departmentObj.getName() == this.getName() && departmentObj.getLocation() == this.getLocation());
	}

	public void print() {
		for(Position position : positions) {
			System.out.printf("| %s :", position.getTitle());
			position.print();
			if(positions.indexOf(position) == positions.size() - 1)
				System.out.print(" |");
		}
	}
	
	public double getSalary() {
		double totalSalary = 0;
		for(Position position : positions) {
			totalSalary += position.getSalary();
		}
		return totalSalary;
	}
	
	private Position getCeo() {
		return ceo;
	}

	private void setCeo(Position ceo) {
		this.ceo = ceo;
	}

	public Company getCompany() {
		return company;
	}

	private void setCompany(Company company) {
		this.company = company;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public ArrayList<Position> getPositions() {
		return positions;
	}

	public void setPositions(ArrayList<Position> positions) {
		this.positions = positions;
	}
	
	public void addPosition(Position position) {
		positions.add(position);
	}
	
}
