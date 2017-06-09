package trees.BST;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class EmployeeTest {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<>();
		al.add(new Employee("John", 13));
		al.add(new Employee("Jack", 14));
		al.add(new Employee("John", 13));
		al.add(new Employee("Julia", 15));
		al.add(new Employee("Sam", 16));
		al.add(new Employee("Sotomayer", 17));
		al.add(new Employee("Singer", 18));
		al.add(new Employee("Sam", 19));
		al.add(new Employee("John", 20));
		HashMap<Employee, Employee> hm = new HashMap<>();
		Iterator<Employee> it = al.iterator();
		Employee val = null;
		while (it.hasNext()) {
			val = it.next();
			if (hm.containsKey(val))
				it.remove();
			else
				hm.put(val, val);
		}
		for (Employee i : al) {
			System.out.println(i);
		}
		System.out.println(hm.keySet());
	}

}
