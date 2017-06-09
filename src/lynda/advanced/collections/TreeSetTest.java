package lynda.advanced.collections;

import lynda.advanced.collections.olives.Kalamata;
import lynda.advanced.collections.olives.Ligurio;
import lynda.advanced.collections.olives.Olive;
import lynda.advanced.collections.olives.Picholine;

import java.util.TreeSet;

public class TreeSetTest {

    //*****sorts using compareTo() method*****
    public static void main(String[] args) {
        Olive lig = new Ligurio();
        Olive kal = new Kalamata();
        Olive pic = new Picholine();

        TreeSet<Olive> olives = new TreeSet<>();
        try {
            olives.add(pic);
            olives.add(kal);
            olives.add(lig);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ;
        }
        System.out.println(olives);
    }
}
