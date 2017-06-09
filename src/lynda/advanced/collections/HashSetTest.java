package lynda.advanced.collections;

import lynda.advanced.collections.olives.Kalamata;
import lynda.advanced.collections.olives.Ligurio;
import lynda.advanced.collections.olives.Olive;
import lynda.advanced.collections.olives.Picholine;

import java.util.HashSet;

public class HashSetTest {

    public static void main(String[] args) {
        Olive lig = new Ligurio();
        Olive kal = new Kalamata();
        Olive pic = new Picholine();

        HashSet<Olive> olives = new HashSet<>();
        olives.add(pic);
        olives.add(lig);
        olives.add(kal);
        System.out.println("There are " + olives.size() + " olives in the set.");
        System.out.println("There are " + olives.size() + " olives in the set.");
        olives.add(pic);
        System.out.println("There are " + olives.size() + " olives in the set.");
        //set can have one reference to each object and one reference to null.
        // *******no duplicate objects*******
        System.out.println(olives);
        olives.remove(lig);
        System.out.println("There are " + olives.size() + " olives in the set.");
    }

}
