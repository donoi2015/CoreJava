package ocjp.ch1.virtualmethodinvocation;

/**
 * @author ts-tuluv.battulga
 */
class Cat extends Animal {
    String name = "Cat";

    void printName() {
        System.out.println(name);
    }

    void play() {
        System.out.println("Cat play");
    }
}
