package ocja.assessment;

/**
 * @author ts-tuluv.battulga
 */
interface Animal {
    default String getName() {
        return null;
    }
}

interface Mammal {
    default String getName() {
        return null;
    }
}

abstract class Otter implements Mammal, Animal {
    public String getName() {
        return null;
    }
}
//         The code compiles without issue.
//         Remove the default method modifier and method implementation on line 1.
//         Remove the default method modifier and method implementation on line 2.
//  X      Remove the default method modifier and method implementation on lines 1 and 2.
//         Change the return value on line 1 from null to "Animal".
//  X      Override the getName() method with an abstract method in the Otter class.
//  X      Override the getName() method with a concrete method in the Otter class.