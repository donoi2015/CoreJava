package trees.lab9;

public class SalaryAndNumber {
	private int salary;
	private int number;
	public SalaryAndNumber(int salary, int number) {
		this.salary = salary;
		this.number = number;
	}
	@Override
	public String toString() {
		String sb = "[" + "salary : " + salary + ", " +
				"number of employees having this salary : " + number + "]";
		return sb;
	}
	public int getSalary() {
		return salary;
	}
	public int getNumber() {
		return number;
	}
}
