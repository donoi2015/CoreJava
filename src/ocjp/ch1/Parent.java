package ocjp.ch1;

/**
 * @author ts-tuluv.battulga
 */
class Parent {

    String name = "Parent";

    static String pstatic = verify("1a - Parent's static class variable pstatic initialized.");

    static {System.out.println("1b - Parent's static initialization block ran.");}

    String p = verify("4  - Parent's non-static class variable p initialized.");

    Parent() {
        System.out.println("5  - Parent constructor ran.");
    }

    static String verify(String s) {
        System.out.println(s);
        return s;
    }
}

class Child extends Parent {

    String name = "Child";
    static String cstatic = verify("2b - Child's static class variable cstatic initialized.");

    static {
        System.out.println("2a - Child's static initialization block ran.");
    }

    String c = verify("6  - Child's non-static class variable c initialized.");

    private Child() {
        super();   //providing super( ) won't change anything here
        System.out.println("7  - Child constructor ran.");
    }

    public static void main(String[] args) {
        System.out.println("3  - Child's main(..) method ran. Invoking Child with new.");
        Child C = new Child();
        System.out.println("8  - The rest of main(..) was run.");
    }
}