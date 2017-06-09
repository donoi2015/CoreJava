package datastructures.hashtables.handmade.MyHashTable;

import java.util.Arrays;
import java.util.Scanner;

//using MyHashTable
public class Problem1a {
	
	public static void main(String[] args) {
		MyHashTable mht = new MyHashTable();
		String[] abbr = { "ad", "au", "jp", "et", "us", "mn" };
		String[] full = { "Andorra", "Australia", "Japan", "Ethiopia", "United States", "Mongolia" };
		for (int i = 0; i < abbr.length; i++) {
			mht.put(abbr[i], full[i]);
		}
		Scanner sc = null;
		while (true) {
			System.out.print("Please type in two-letter country code:");
			sc = new Scanner(System.in);
			String ss = sc.nextLine().toLowerCase();
			if (ss.matches("[a-z]{2}")) {
				if (Arrays.asList(abbr).contains(ss))
					System.out.println(mht.get(ss));
				else
					System.out.println("It isn't in the list!");
			} else {
				System.err.print("Wrong input format");
				continue;
			}
			System.out.print("Would you like to repeat?");
			ss = sc.nextLine();
			if (!ss.startsWith("y")) {
				break;
			}
		}
		if (sc != null) {
			sc.close();
		}
	}
}
