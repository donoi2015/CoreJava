package ocja.chapter3;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ts-tuluv.battulga
 */
public class CoreAPI {
    public static void main(String[] args) {
        parseAndValueOf();
        arrayToFromList();
        dates();
        dateFormat();
    }

    public static void parseAndValueOf() {
        try {
            //from String to primitive and Wrapper class
            int primitive = Integer.parseInt("45");
            Integer integer = Integer.valueOf("45");
        } catch (NumberFormatException num) {
            System.out.println(num.getMessage());
        }

    }

    public static void arrayToFromList() {
        //convert data
        int[] arr1 = { 2, 3, 4, 5 };
        Integer[] arr2 = { 2, 3, 4, 5 };

        List<String> list11 = new ArrayList<>(Arrays.asList("James", "Bob"));

        //from int[] to ArrayList<Integer>
        List<Integer> list2 = new ArrayList<>();
        list2 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        //from Integer[] to ArrayList<Integer>
        List<Integer> list21 = Arrays.asList(arr2); // Cannot modify returned list, also not possible for int[] only for Integer[]
        List<Integer> list22 = new ArrayList<>(Arrays.asList(arr2)); // good
        List<Integer> list23 = Arrays.stream(arr2).collect(Collectors.toList()); //Java 8
        //from ArrayList<String> to String[]
        String[] arr3 = list11.toArray(new String[0]);

        //if you just need quick list of ints
        List<Integer> list3 = Arrays.asList(1, 3, 43);
        System.out.println(list3);
        //        list3.add(3); // UnsupportedOperationException
        //        System.out.println(list3);

    }

    public static void dates() {
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        Period month = Period.ofMonths(1);

        performAnimalEnrichment(start, end, month);
    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("Give new toy:" + upTo);
            upTo = upTo.plus(period);
        }
    }

    private static void dateFormat() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.parse("09 05 1989", f);
        System.out.println(date);
    }
}
