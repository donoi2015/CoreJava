package headfirstdp.headfirst.combining.composite;

import java.util.Iterator;
import java.util.ArrayList;

public class Flock implements Quackable {
	private ArrayList quackers = new ArrayList();
 
	public void add(Quackable quacker) {
		quackers.add(quacker);
	}
 
	public void quack() {
        for (Object quacker1 : quackers) {
            Quackable quacker = (Quackable) quacker1;
            quacker.quack();
        }
	}
 
	public String toString() {
		return "Flock of Quackers";
	}
}
