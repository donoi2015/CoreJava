package ocjp.ch1.nestedclasses;

/**
 * @author ts-tuluv.battulga
 */
public class Outer {
    private static int x = 5;
    private int y = 2;

    class Inner {
        //        private static String x = "";    Inner classes cannot have static variables
        private int x = 10;  //shadowing

        void go() {
            System.out.println(x);
            System.out.println(Outer.x);        //access outer iv
            System.out.println(Outer.this.y);   //access outer cv
            Outer.this.go();                    //access outer method
            gwalk();                            //access outer static method

        }
    }

    static void gwalk() {
        System.out.println("Walk");
    }

    void go() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner in = out.new Inner();
        in.go();
        Inner inn = out.new Inner();
    }
}
