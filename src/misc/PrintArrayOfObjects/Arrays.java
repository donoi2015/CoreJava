package misc.PrintArrayOfObjects;

import java.util.Random;

public class Arrays {

	public static void main(String[] args) {
		int[] num = new int[10];
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		for (int i = 0; i < num.length; i++) {
			num[i] = rand.nextInt(100);
		}
		int[] old = num.clone();
		System.out.println("equals before sort"	+ java.util.Arrays.equals(num, old));
		java.util.Arrays.sort(num);
		System.out.println("equals after sort" + java.util.Arrays.equals(num, old));
		System.out.println("old: " + java.util.Arrays.toString(old));
		System.out.println("num: " + java.util.Arrays.toString(num));
		System.out.println("num: " + num.toString());
	}
}
