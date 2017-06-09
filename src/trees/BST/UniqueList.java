package trees.BST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class UniqueList {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>(Arrays.asList(13, 13, 24, 25, 1, 4, 23, 18, 1));
		HashMap<Integer, String> hm = new HashMap<>();
		for (int i : l) {
			hm.put(i, i + "");
			System.out.print(i + " ");
		}
		System.out.println("\nHM:");
		for (int i : hm.keySet()) {
			System.out.print(hm.get(i) + " ");
		}
		System.out.println("\nSize:");
		System.out.println(hm.size());
	}
}