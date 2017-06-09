package trees.traversal;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		int[] sample = new int[] { 15, 10, 5, 12, 20, 17, 25 };
		for (int i : sample) {
			ts.add(i);
		}
        for (Integer t : ts) {
            System.out.print(t + " ");
        }
	}
}