package ocja.chapter2;

import java.util.Arrays;

/**
 * @author ts-tuluv.battulga
 */
public class Lessons {
    public static void main(String[] args) {
        //        compound();
        //        logical();
        //        switchCase();
        //        toUpper();
        arrayEquals();
    }

    public static void compound() {
        int x = 4;
        long y = 10;
        x *= y;
        //        x=x*y; //DOES NOT COMPILE
        System.out.println(x);
        x = (int) (x * y);
        System.out.println(x);
    }

    public static void logical() {
        //logical operators when applied on boolean
        //bitwise operators when applied on numeric data types
        // & AND                true only if both true
        // | INCLUSIVE OR       false only if both false
        // ^ EXCLUSIVE OR       true only if both different
        // CONDITIONAL OPERATORS     && ||   (SHORT-CIRCUIT OPERATORS)
        // Logical operators will always calculate both sides while Conditional operators may skip right hand side.
        int x = 6;
        boolean y = (x >= 6) || (++x <= 7);
        System.out.println(x);
    }

    private int getSortOrder(String firstName, final String lastName) {
        String middleName = "Patricia";
        final String suffix = "JR";
        int id = 0;
        switch (firstName) {
        case "Test":
            return 52;
        //        case middleName:       // DOES NOT COMPILE
        //            id = 5;
        //            break;
        case suffix:
            id = 0;
            break;
        //        case lastName:  // DOES NOT COMPILE
        //            id = 8;
        //            break;
        //        case 5:  // DOES NOT COMPILE
        //            id = 7;
        //            break;
        //        case 'J':  // DOES NOT COMPILE
        //            id = 10;
        //            break;
        //        case java.time.DayOfWeek.SUNDAY:  // DOES NOT COMPILE
        //            id=15;
        //            break;
        }
        return id;
    }

    public static void switchCase() {
        final char a = 'A', d = 'D';
        char grade = 'B';
        switch (grade) {
        case a:
        case 'B':
            System.out.println("great");
            break;
        case 'C':
            System.out.println("good");
            break;
        case d:
        case 'F':
            System.out.println("not good");
        }
    }

    public static void toUpper() {

        String football = "Chelsea";
        football.toUpperCase(); // returns. doesn't change original object
        System.out.println(football);
        System.out.println(football.toUpperCase());

        StringBuilder sb = new StringBuilder().append(1.0000050000).append('c');
        sb.append("-").append(true);
        System.out.println(sb);

        String a = sb.toString();
        String b = sb.toString();
        System.out.println(a == b); // false

        String x = "Hello World";
        String y = "Hello World".trim();
        String z = " Hello World".trim();
        System.out.println("x==y:" + (x == y));
        System.out.println("x==z:" + (x == z)); // false
        System.out.println("x==z:" + (y == z)); // false
    }

    public static void arrayEquals() {
        int[] a = { 4, 5, 6 };
        int[] b = { 4, 5, 6 };
        System.out.println(a == b); // false
        System.out.println(a.equals(b)); //false
        System.out.println(a);
        System.out.println(Arrays.toString(a));
    }
}
