/*
 * Copyright (c) ${year} by Rakuten, Inc. All Rights Reserved.
 */
package ocja.assessment;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ts-tuluv.battulga
 */
class AssessmentTest {

    private static int $;

    public static void main(String[] main) {
        problem1();
        problem2();
        problem3();
        problem4();
        problem5();
        problem6();
        problem7();
    }

    public static void problem1() {
        System.out.println("problem1------------------------");
        String a_b;
        System.out.println($);
        //        System.out.print(a_b);
    }

    public static void problem2() {
        System.out.println("problem2------------------------");
        String s1 = "Java";
        String s2 = "Java";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb1.toString() == s1);
        System.out.println(sb1.toString().equals(s1));
    }

    public static void problem3() {
        //        System.out.println("problem3------------------------");
        //        interface HasTail {
        //            int getTailLength();
        //        }
        //        abstract class Puma implements HasTail {
        //            protected int getTailLength() {
        //                return 4;
        //            }
        //        }
        //        public class Cougar extends Puma {
        //            public static void main(String[] args) {
        //                Puma puma = new Puma();
        //                System.out.println(puma.getTailLength());
        //            }
        //
        //            public int getTailLength(int length) {
        //                return 2;
        //            }
        //        }
    }

    public static void problem4() {
        System.out.println("problem4------------------------");
        boolean keepGoing = true;
        int count = 0;
        int x = 3;
        while (count++ < 3) {
            int y = (1 + 2 * count) % 3;
            switch (y) {
            default:
            case 0:
                x -= 1;
                break;
            case 1:
                x += 5;
            }
        }
        System.out.println(x);
    }

    public static void problem5() {
        System.out.println("problem5------------------------");
        System.out.print("a");
        try {
            System.out.print("b");
            throw new IllegalArgumentException();
        } catch (RuntimeException e) {
            System.out.print("c");
        } finally {
            System.out.print("d");
        }
        System.out.print("e");
    }

    public static void problem6() {
        System.out.println("problem6------------------------");
        int a = 15;
        int b = 10;
        problem6helper(a, b);
        System.out.println(a); //prints 15 because only copy of 15 is passed to method
    }

    public static void problem6helper(int x, int amountToAdd) {
        x = x + amountToAdd;
    }

    public static void problem7() {
        System.out.println("problem7------------------------");
        int[] array = { 6, 9, 8 };
        List<Integer> list = new ArrayList<>();
        list.add(array[0]);
        list.add(array[2]);
        list.set(1, array[1]);
        list.remove(0);
        System.out.println(list);

        //[8]
        //[9]
        //        Something like [Ljava.lang.String;@160bc7c0
        //        An exception is thrown.
        //        The code does not compile.

        //        B. The array is allowed to use an anonymous initializer because it is in the same line as the declaration.
        // The ArrayList uses the diamond operator allowed since Java 7. This specifies the type matches the one on the left without having to re-type it.
        // After adding the two elements, list contains [6, 8]. We then replace the element at index 1 with 9, resulting in [6, 9].
        // Finally, we remove the element at index 0, leaving [9].
        // Option C is incorrect because arrays output something like that rather than an ArrayList. For more information, see Chapter 3.
    }

    public static void problem9() {
        //        Checked exceptions are intended to be thrown by the JVM (and not the programmer).
        //        Checked exceptions are required to be caught or declared.
        //                Errors are intended to be thrown by the JVM (and not the programmer).
        //        Errors are required to be caught or declared.
        //        Runtime exceptions are intended to be thrown by the JVM (and not the programmer).
        //        Runtime exceptions are required to be caught or declared.
    }

    public static void problem10() {
        //          import java.util.*;
        //          public class Grasshopper {
        //                private String name;
        //                public Grasshopper(String n) {
        //                  name = n;
        //                }
        //                public static void main(String[] args) {
        //                    Grasshopper one = new Grasshopper("g1");
        //                    Grasshopper two = new Grasshopper("g2");
        //                    one = two; //line 9
        //                    two = null;
        //                    one = null;
        //                }
        //          }
    }
    //    Immediately after line 9, no grasshopper objects are eligible for garbage collection.
    // Immediately after line 10, no grasshopper objects are eligible for garbage collection.
    // Immediately after line 9, only one grasshopper object is eligible for garbage collection. g1 up for gc X
    // Immediately after line 10, only one grasshopper object is eligible for garbage collection. still only g1 X
    // Immediately after line 11, only one grasshopper object is eligible for garbage collection. g1 and g2 up for gc
    // The code compiles. compiles X
    // The code does not compile.

    public static void problem11() {

    }
}
