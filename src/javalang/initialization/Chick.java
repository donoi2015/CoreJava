package javalang.initialization;

/**
 * @author ts-tuluv.battulga
 */
public class Chick extends Animal {
    private static int age;

    { System.out.println("initializer"); }

    static {
        System.out.println("static initializer");
    }

    private Chick() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        Chick chick = new Chick();
    }
}

class Animal {

    {System.out.println("parent initializer");}

    static {
        System.out.println("parent static initializer");
    }

    Animal() {
        System.out.println("parent constructor");
    }
}