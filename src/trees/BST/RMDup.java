package trees.BST;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class RMDup {
	/*
	 * public List<Integer> myList;
	 * 
	 * public RMDup() { myList = new LinkedList<Integer>();
	 * 
	 * }
	 */

	private void removeDup(List<Integer> myList) {
		Map<Integer, Integer> map = new HashMap<>();
		int val = 0;
		Iterator<Integer> it = myList.iterator();
		while (it.hasNext()) {
			val = it.next();
			if (map.containsKey(val)) {
				it.remove();
			} else {
				map.put(val, val);
			}
		}
		System.out.println(myList);
	}

	public static void main(String[] args) {
		List<Integer> myList = new LinkedList<>();
		myList.add(1);
		myList.add(2);
		myList.add(1);
		myList.add(2);
		myList.add(1);
		myList.add(1);
		RMDup rr = new RMDup();
		rr.removeDup(myList);
	}

}
