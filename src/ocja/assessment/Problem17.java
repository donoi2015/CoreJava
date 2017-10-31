package ocja.assessment;

import java.util.function.Predicate;

/**
 * @author ts-tuluv.battulga
 */
public class Problem17 {
    public static void main(String[] args) {
        System.out.println(test(i -> i == 5));
        System.out.println(test((i) -> i == 5));
        System.out.println(test((i) -> {
            return i == 5;
        }));
    }

    private static boolean test(Predicate<Integer> p) {
        return p.test(5);
    }
}

//X      System.out.println(test(i -> i == 5));
//      System.out.println(test(i -> {i == 5;}));
//x      System.out.println(test((i) -> i == 5));
//      System.out.println(test((int i) -> i == 5);
//      System.out.println(test((int i) -> {return i == 5;}));
//X      System.out.println(test((i) -> {return i == 5;}));
// The only functional programming interface you need to memorize for the exam is Problem17.
// It takes a single parameter and returns a boolean.
// Lambda expressions with one parameter are allowed to omit the parentheses around the parameter list, making options A and C correct.
// The return statement is optional when a single statement is in the body, making option F correct.
// Option B is incorrect because a return statement must be used if braces are included around the body.
// Options D and E are incorrect because the type is Integer in the predicate and int in the lambda.
// Autoboxing works for collections not inferring predicates.
// If these two were changed to Integer, they would be correct. For more information, see Chapter 4.
