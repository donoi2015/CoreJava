package lynda.advanced.LocalInnerClasses;

import java.util.ArrayList;

public class OliveJar {
    public ArrayList<Olive> olives;

    // static initializer
    {
        System.out.println("Initializing...");
        olives = new ArrayList<>();
        olives.add(new Olive("Golden", 0xDA9100));
    }

    // constructor
    public OliveJar() {
        System.out.println("Constructor");
    }

    // constructor2
    public OliveJar(int nOlives, String oliveName, long color) {
        for (int i = 1; i <= nOlives; i++) {
            olives.add(new Olive(oliveName, color));
        }
    }

    // add
    public void addOlive(String oliveName, long aColor) {
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

    class Olive { // Member class only callable by OliveJar
        public static final long BLACK = 0x000000;
        public String oliveName;
        public long color = BLACK;

        // const1
        public Olive() {
        }

        // const2
        public Olive(String aOliveName) {
            oliveName = aOliveName;
        }

        // const3
        public Olive(String aOliveName, long aColor) {
            oliveName = aOliveName;
            color = aColor;
        }

        // getters & setters
        public String getOliveName() {
            return oliveName;
        }

        public long getColor() {
            return color;
        }

        public void setOliveName(String aOliveName) {
            oliveName = aOliveName;
        }

        public void setColor(long aColor) {
            color = aColor;
        }
    }
}
