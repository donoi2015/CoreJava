package javalang.equals;


class Employee {
	private String name;
	private int salary;

	Employee(String aName, int aSalary) {
		name = aName;
		salary = aSalary;
	}

	@Override
	public boolean equals(Object aObj) {
		if(aObj instanceof Employee){
			Employee other = (Employee) aObj;
			if(other.name.equals(this.name)) return true;
		} 
		return false;
	}
}