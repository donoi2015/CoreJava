package ocjp.ch1.virtualmethodinvocation;

/**
 * @author ts-tuluv.battulga
 */
public class Main {
    public static void main(String[] args) {

        // Call overridden method
        System.out.println("Call overridden method");
        Animal cat = new Cat();
        Cat cat2 = new Cat();
        // Call parent.method(). child.printName() and overrides parent.method() so using child.method(). child.method() uses child.name = Cat
        cat.printName();  //parent.method() -> child.method() -> child.name
        // Call child.method(). It overrides parent.method(), child.method() will use child.name = Cat
        cat2.printName(); //child.method() -> child.name
        System.out.println(cat.name);//parent.name - ???
        System.out.println(cat2.name);//child.name - Cat

        // Call non-overridden method
        System.out.println("Call non-overridden method");
        // While compiler actively looks for overriding methods and use them, it doesn't look for overriding Instance Variables and use them.
        Animal lion = new Lion();
        Lion lion2 = new Lion();

        // Call parent.method(). parent.method() will use parent.name = ???
        lion.printName();//parent.method() -> parent.name
        // Call child.method(). child.method() actually doesn't exist, so we're actually calling inherited method from parent. Since it's parent's method, it will use parent's IV.
        lion2.printName();//child.method() -> parent.method() -> parent.name (even though child.name exists)
        System.out.println(lion.name); //parent.name
        System.out.println(lion2.name);//child.name

        // animalPlay() is animal specific method which calls play() which is not overridden by anything; uses Animal.play()
        lion.animalPlay();
        // animalPlay() is animal specific method which calls play() which is overridden by Cat; uses Cat.play() --> compiler looks for overridden methods during runtime
        cat.play();

        //Suppose y extends x.
        //There is x.name and y.name while there will only be one name() method, can't access x.name() when there's y.name()
        // x.name() will use x.name
        // y.name() will use y.name
        // if y is a child class of x that overrides name(), calls to x.name(), where x points to instance of y, are in fact calls to y.name(),
        // so the result of x.name() will be y.name.
        // --> If child.name() exists,          child.name() overrides parent.name(), child.name() uses child.name, so in effect call to parent.name() uses child.name     -->Cat (cat)
        //                                      child.name() overrides parent.name(), child.name() uses child.name, call to child.name() uses child.name                   -->Cat (cat2)
        //call to child.name() doesn't care about child.name() overriding parent.name()
        // --> If child.name() doesn't exist,   parent.name() and child.name() both use same name() method in parent, uses parent.name

        // if you want to use parent.name use parent.name()
        // if you want to use child.name override parent.name().
    }
}
