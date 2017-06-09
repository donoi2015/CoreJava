package headfirstdp.headfirst.adapter.iterenum;

import java.util.*;

public class EI {
	public static void main (String args[]) {
		Vector v = new Vector(Arrays.asList(args));
		Enumeration enumeration = v.elements();
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		for (Object aV : v) {
			System.out.println(aV);
		}
	}
}
