package lynda.advanced.collections;

import lynda.advanced.collections.olives.Kalamata;
import lynda.advanced.collections.olives.Ligurio;
import lynda.advanced.collections.olives.Olive;
import lynda.advanced.collections.olives.Picholine;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<Olive> olives = new LinkedList<>();
        olives.add(new Picholine());
        olives.add(new Kalamata());
        olives.add(1, new Ligurio());
        display(olives);
        olives.addFirst(new Kalamata());
        display(olives);
        Olive o1 = olives.peek();
        System.out.println(o1.oliveName.toString());
        display(olives);
        Olive o2 = olives.poll();
        System.out.println(o2.oliveName.toString());
        display(olives);
    }

    static private void display(Collection<Olive> col) {
        System.out.println("List order: ------------");
        Iterator<Olive> iterator = col.iterator();
        while (iterator.hasNext()) {
            Olive olive = (Olive) iterator.next();
            System.out.println(olive.oliveName.toString());
        }
        System.out.println("end ----");
    }

}
