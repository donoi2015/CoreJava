package lynda.advanced.enums;

import java.util.ArrayList;

public class OliveJar {
    public ArrayList<Olive> olives;

    // static initializer
    {
        System.out.println("Initializing...");
        olives = new ArrayList<>();
        olives.add(new Olive(OliveName.GOLDEN, 0xDA9100));
    }

    // constructor
    public OliveJar() {
        System.out.println("Constructor");
    }

    // constructor2
    public OliveJar(int nOlives, OliveName oliveName, long color) {
        for (int i = 1; i <= nOlives; i++) {
            olives.add(new Olive(oliveName, color));
        }
    }

    // add
    public void addOlive(OliveName oliveName, long aColor) {
        olives.add(new Olive(oliveName, aColor));
    }

    // report
    public void reportOlives() {

        class JarLid {
            public void open() {
                System.out.println("Twist, twist, twist . . . ");
                System.out.println("Pop!");
            }
        }

        new JarLid().open();

        for (Olive o : olives) {
            System.out.println("It's a " + o.oliveName + " olive!");
        }
    }
}
