package datastructures.linkedlists.jdk.characterLLJava;

import java.util.LinkedList;

public class StringTest2 {

	public static void main(String[] args) {
		DynamicString ds = new DynamicString();
		ds.readString();
		DynamicString.writeString(ds);
		System.out.println("Size: " + ds.size());
		LinkedList<Character> conc = new LinkedList<>();
		conc.add('a');
		conc.add('m');
		conc.add('e');
		conc.add('n');
		ds.concatenate(conc);
		System.out.println("After concatenation:");
		System.out.println("Size: " + ds.size());
		DynamicString.writeString(ds);
	}
}