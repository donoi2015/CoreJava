package datastructures.hashtables.handmade.MyHashTable;

class Employee {
	private String name;
	private int age;
	private String last_name;
	private int salary;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getLast_name() {
		return last_name;
	}

	public int getSalary() {
		return salary;
	}

	public void setName(String aName) {
		name = aName;
	}

	public void setAge(int aAge) {
		age = aAge;
	}

	public void setLast_name(String aLast_name) {
		last_name = aLast_name;
	}

	public void setSalary(int aSalary) {
		salary = aSalary;
	}

	public Employee(String aName, String aLast_name, int aAge, int aSalary) {
		name = aName;
		age = aAge;
		last_name = aLast_name;
		salary = aSalary;
	}

	@Override
	public String toString() {
		return name + " " + last_name + " " + age + " " + salary;
	}

}
