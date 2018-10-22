package ocjp.ch2.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ts-tuluv.battulga
 */

public class TraditionalSearch {

    public static void main(String[] args) {

        //lambda expression useful to basically use interface's polymorphism.
        // Instead of creating a class which implements the method and then passing a reference to it as parameter
        // we pass the implementation as parameter which is shorthand notation for new anonymous inner class.

        //That's why lambda interface must have only one abstract method. - @FunctionalInterface will check it.
        //because you can't pass two implementations as argument

        List<Animal> animals = new ArrayList<>();
        // list of animals
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        //        print(animals, new CheckIfHopper());      // class that implements CheckTrait.test method
        //        print(animals, (Animal a) -> { return a.canHop(); }); // implementation of a single interface method
        print(animals, a -> a.canHop()); // implementation of a single interface method

        //Before lambda
        //define a single method interface
        //define a class which implements that interface
        //instantiate the class and use the method defined in interface

        //After lambda
        //define a single method interface
        //use lambda expression to pass implementation (implementation is anonymous inner class written in shorthand notation)
    }

    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            // the general check
            if (checker.test(animal)) {
                System.out.print(animal + " ");
            }
        }
        System.out.println();
    }
}