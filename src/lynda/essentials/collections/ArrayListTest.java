package lynda.essentials.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<>(); // only of particular data type (not mixed data type)
	list.add(24);
	ArrayList<Integer> list2 = new ArrayList<>(list);
	list2.add(32);
	list.add(122);
	list.add(267);
		for (Integer aList2 : list2) {
			System.out.println(aList2);
		}
	// Tutorialspoint

	ArrayList<String> al = new ArrayList<>();
	System.out.println("Initial size of al: " + al.size());

	// add elements to the array list
	al.add("C");
	al.add("A");
	al.add("E");
	al.add("B");
	al.add("D");
	al.add("F");
	al.add(1, "A2");
	System.out.println("Size of al after additions: " + al.size());

	// display the array list
	System.out.println("Contents of al: " + al);
	// Remove elements from the array list
	al.remove("F");
	al.remove(2);
	System.out.println("Size of al after deletions: " + al.size());
	System.out.println("Contents of al: " + al);
	List<String> listt = new ArrayList<>(); //(1) This is better than (2) because you can later change to LinkedList.
	// And if you use (2) you will have used ArrayList specific methods. 
	ArrayList<String> listt2 = new ArrayList<>(); //(2) Used rarely for a good reason. 
	System.out.println(listt);
	System.out.println(listt2);
    }    

}


