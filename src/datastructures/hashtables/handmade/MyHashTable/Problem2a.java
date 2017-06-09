package datastructures.hashtables.handmade.MyHashTable;

import java.util.Scanner;

public class Problem2a {

	public static void main(String[] args) {
		new Problem2a();
		MyHashTable mht = new MyHashTable();
		Employee e1 = new Employee("John", "Brzenski", 45, 100_000);
		Employee e2 = new Employee("Clark", "Kent", 45, 70_000);
		Employee e3 = new Employee("Bruce", "Wayen", 45, 1_000_000);
		Employee e4 = new Employee("Harvey", "Specter", 45, 100_000);
		Employee e5 = new Employee("Mike", "Ross", 45, 100_000);
		Employee e6 = new Employee("Mickey", "McDouglas", 45, 100_000);
		mht.put(e1.getName(), e1);
		mht.put(e2.getName(), e2);
		mht.put(e3.getName(), e3);
		mht.put(e4.getName(), e4);
		mht.put(e5.getName(), e5);
		mht.put(e6.getName(), e6);
		Scanner sc = null;
		while (true) {
			System.out.print("Please type in name:");
			sc = new Scanner(System.in);
			String name = sc.nextLine();
			Employee temp;
			try {
				temp = (Employee) mht.get(name);
				System.out.println(temp);
			} catch (NullPointerException e) {
				System.out.println("Not in the table");
			}
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
