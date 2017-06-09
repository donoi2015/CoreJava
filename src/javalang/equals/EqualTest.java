package javalang.equals;

public class EqualTest {

	public static void main(String[] args) {
		Employee e1 = new Employee("abc",100000);
		Employee e2 = new Employee("abc",50000);
		System.out.println(e1.equals(e2));
	}
}