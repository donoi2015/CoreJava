/*
 * Copyright (c) ${year} by Rakuten, Inc. All Rights Reserved.
 */
package ocja.assessment;

/**
 * @author ts-tuluv.battulga
 */
public class Deer {
    public Deer() {
        System.out.print("Deer");
    }

    public Deer(int age) {
        System.out.print("DeerAge");
    }

    private boolean hasHorns() {
        return false;
    }

    public static void main(String[] args) {
        Deer deer = new Reindeer(5);
        System.out.println("," + deer.hasHorns()); //deer - ability to call method, actual method called is last overridden method.
        //here however, hasHorns is private so it wasn't overridden, if it was public Reindeer.hasHorns() will be called.
    }
}

class Reindeer extends Deer {
    public Reindeer(int age) {
        System.out.print("Reindeer");
    }

    public boolean hasHorns() {
        return true;
    }
}

//    DeerReindeer,false
//    DeerReindeer,true
//    ReindeerDeer,false
//    ReindeerDeer,true
//    DeerAgeReindeer,false
//    DeerAgeReindeer,true
//    The code will not compile because of line 7.
//    The code will not compile because of line 12.

//    A. The code compiles and runs without issue, so options G and H are incorrect. First, the Reindeer object is instantiated using the constructor that takes an int value. Since there is no explicit call to the parent constructor, the default no-argument super() is inserted as the first line of the constructor. The output is then Deer, followed by Reindeer in the child constructor, so only options A and B can be correct. Next, the method hasHorns() looks like an overridden method, but it is actually a hidden method since it is declared private in the parent class. Because the hidden method is referenced in the parent class, the parent version is used, so the code outputs false, and option A is the correct answer.