/*
 * Copyright (c) ${year} by Rakuten, Inc. All Rights Reserved.
 */
package ocja.assessment;

/**
 * @author ts-tuluv.battulga
 */
interface HasTail {
    int getTailLength(); //assumed to be public since it's in interface
}

abstract class Puma implements HasTail {
    //    protected int getTailLength() { //line 3 - this is invalid because implementation can't be more restrictive than interface
    public int getTailLength() { //fixed version
        return 4;
    }
}

public class Cougar extends Puma { //line 5
    public static void main(String[] args) {
        //        Puma puma = new Puma(); //line 7
        //        System.out.println(puma.getTailLength());
    }

    public int getTailLength(int length) {
        return 2;
    }
}

//        2
//        4
//        The code will not compile because of line 3. X
//        The code will not compile because of line 5.X
//        The code will not compile because of line 7.X
//        The code will not compile because of line 11.
//        The output cannot be determined from the code provided.

//C, D, E. First, the method getTailLength() in the interface HasTail is assumed to be public, since it is part of an interface. The implementation of the method on line 3 is therefore an invalid override, as protected is a more restrictive access modifier than public, so option C is correct. Next, the class Cougar implements an overloaded version of getTailLength(), but since the declaration in the parent class Puma is invalid, it needs to implement a public version of the method. Since it does not, the declaration of Puma is invalid, so option D is correct. Option E is incorrect, since Puma is marked abstract and cannot be instantiated. The overloaded method on line 11 is declared correctly, so option F is not correct. Finally, as the code has multiple compiler errors, options A, B, and G can be eliminated. For more information, see Chapter 5.