package ocjp.ch1.virtualmethodinvocation;

/**
 * @author ts-tuluv.battulga
 */
class Animal {
    String name = "???";

    void printName() {
        System.out.println(name);
    }

    void animalPlay() {
        play();
    }

    void play() {
        System.out.println("Animal play");
    }
}
