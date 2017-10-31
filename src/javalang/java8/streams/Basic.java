package javalang.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//http://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/
public class Basic {
    public static void main(String[] args) {
        //        stream1();
        //        stream2();
        //        stream3();
        //        stream4();
        //        stream5();//11 operations
        //        stream6();//7 operations because filter is first
        stream7();
    }

    static void stream1() {
        System.out.println("1. On list using List.stream():");
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        myList.stream().filter(s -> s.startsWith("c")) //apply Predicate and return stream
                .map(String::toUpperCase) //apply Function and return stream
                .sorted() //return sorted by "natural order" and return stream
                .forEach(System.out::println); // apply Consumer on all elements (action should be non-interfering)
    }

    static void stream2() {
        System.out.println("2. On any number of objects using Stream.of:");
        System.out.println("Strings");
        Stream.of("a1", "a2", "b1", "c2", "c1").filter(s -> s.startsWith("c")).map(String::toUpperCase).sorted().forEach(System.out::println);

        System.out.println("primitives");
        Stream.of(24, 35, 1, 4, 5, 7).filter(x -> x > 10).sorted().forEach(System.out::println);
    }

    static void stream3() {
        System.out.println("3. work on arrays:");
        Arrays.stream(new int[] { 1, 2, 3 }).map(n -> 2 * n + 1) //takes int returns int
                .average() //special case of reduction.
                .ifPresent(System.out::println);  // 5.0
    }

    static void stream4() {
        System.out.println("3. Int to object mapping:");
        IntStream.range(1, 4).mapToObj(i -> "a" + i).forEach(System.out::println);
    }

    static void stream5() {
        Stream.of("d2", "a2", "b1", "b3", "c").map(s -> {
            System.out.println("map: " + s);
            return s.toUpperCase();
        }).filter(s -> {
            System.out.println("filter: " + s);
            return s.startsWith("A");
        }).forEach(s -> System.out.println("forEach: " + s));
    }

    static void stream6() {
        Stream.of("d2", "a2", "b1", "b3", "c").filter(s -> {
            System.out.println("filter: " + s);
            return s.startsWith("a");
        }).map(s -> {
            System.out.println("map: " + s);
            return s.toUpperCase();
        }).forEach(s -> System.out.println("forEach: " + s));
    }

    static void stream7() {
        System.out.println("7. collect(Collectors.toList()):");
        List<Person> mypeople = Stream
                .of(new Person("Mike", "Tyson"), new Person("John", "Adams"), new Person("First", "Last"), new Person("Fernando", "Castro"))
                .filter(person -> person.getFirstName().startsWith("F")).collect(Collectors.toList());

        mypeople.forEach(System.out::println);
    }

    static class Person {
        private String firstName;
        private String lastName;

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        //<editor-fold desc="getters and setters">
        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        //</editor-fold>

        @Override public String toString() {
            return "Person{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + '}';
        }
    }

}
