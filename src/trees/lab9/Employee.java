package trees.lab9;

import java.util.Date;
import java.util.GregorianCalendar;

class Employee {

	private String name;
	private Date hireDate;
	private int salary;
	
	public Employee(String name, int salary, int year, int month, int day){
		this.name = name;
		this.salary = salary;
		GregorianCalendar cal = 
			new GregorianCalendar(year,month,day);
		hireDate= cal.getTime();
	}

	private Date getHireDate() {
		return (Date)hireDate.clone();
	}
	private String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public boolean equals(Object o){
		if(o.getClass() != this.getClass()) {
			return false;
		}
		Employee e = (Employee)o;
		return (e.getName().equals(name)&& 
				e.getHireDate().equals(hireDate) &&
				e.getSalary()== salary);
	}
	
	public int hashCode(){
		return name.hashCode() + 
				5* Math.round(salary) +
				5 * 5 * hireDate.hashCode();
	}
	public String toString() {
		return "["+name+": " + salary + "]";
	}

	

}

