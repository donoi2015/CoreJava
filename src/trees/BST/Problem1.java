package trees.BST;

import java.util.Iterator;
import java.util.LinkedList;

public class Problem1 {

	public static void main(String[] args) {
		// get a linked list and return a ll with elements>200.
		LinkedList<Integer> samples = new LinkedList<>();
		samples.add(250);
		samples.add(150);
		LinkedList<Integer> renewed = over_200(samples);
		System.out.println(renewed);
	}

	private static LinkedList<Integer> over_200(LinkedList<Integer> l) {
		Iterator<Integer> it = l.iterator();
		LinkedList<Integer> fresh = new LinkedList<>();
		while (it.hasNext()) {
			int k = it.next();
			if (k >= 200) {
				fresh.add(k);
			}
		}
		return fresh;
	}

}
