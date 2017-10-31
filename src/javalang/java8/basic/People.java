package javalang.java8.basic;

import javalang.java8.basic.model.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class People {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Jackson", "Michael"), new Person("James", "LeBron"), new Person("Clark", "James"),
                new Person("Eastwood", "Clint"), new Person("Brown", "Gordon"));
        //1. Sort list by first name
        people.sort((p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));
        //2. Print all elements in the list
        //        people.forEach(person -> System.out.println(person));
        //        people.forEach(System.out::println);
        //        printConditionally(people,p -> true);
        //3. Print all people with last name beginning with "C"
        //        printConditionally(people, new Condition() {
        //            @Override
        //            public boolean test(Person p) {
        //                return p.getLastName().startsWith("C");
        //            }
        //        });
        printConditionally(people, p -> p.getLastName().startsWith("C"));
        printConditionally2(people, p -> p.getLastName().startsWith("C"));
        //p is argument. p.getLastName..... is implementation method of the Predicate/Condition
        //interface.
    }

    public static void printConditionally(List<Person> people, Condition condition) {
        for (Person p : people) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }
    }

    public static void printConditionally2(List<Person> people, Predicate<Person> condition) {
        for (Person p : people) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }
    }
}

interface Condition {
    boolean test(Person p);
}