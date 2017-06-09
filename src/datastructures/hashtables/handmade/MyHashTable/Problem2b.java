package datastructures.hashtables.handmade.MyHashTable;

import java.util.HashMap;
import java.util.Scanner;

public class Problem2b {

	public static void main(String[] args) {
		new Problem2b();
		HashMap<String, Employee> hm = new HashMap<>();
		Employee e1 = new Employee("John", "Brzenski", 45, 100_000);
		Employee e2 = new Employee("Clark", "Kent", 45, 70_000);
		Employee e3 = new Employee("Bruce", "Wayen", 45, 1_000_000);
		Employee e4 = new Employee("Harvey", "Specter", 45, 100_000);
		Employee e5 = new Employee("Mike", "Ross", 45, 100_000);
		Employee e6 = new Employee("Mickey", "McDouglas", 45, 100_000);
		hm.put(e1.getName(), e1);
		hm.put(e2.getName(), e2);
		hm.put(e3.getName(), e3);
		hm.put(e4.getName(), e4);
		hm.put(e5.getName(), e5);
		hm.put(e6.getName(), e6);
		Scanner sc = null;
		while (true) {
			System.out.print("Please type in name:");
			sc = new Scanner(System.in);
			String name = sc.nextLine();
			if (hm.containsKey(name))
				System.out.println(hm.get(name));
			else
				System.err.println("Not in the table");

			System.out.print("Would you like to repeat?");
			String rep = sc.nextLine();
			if (!rep.startsWith("y")) {
				break;
			}
		}
		if (sc != null) {
			sc.close();
		}
	}

}
