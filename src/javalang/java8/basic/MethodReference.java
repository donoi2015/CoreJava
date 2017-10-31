package javalang.java8.basic;

import javalang.java8.basic.model.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

//method references are only useful for the simplest cases, where you dont need to work with the passed parameter extensively.
//if you're only consuming the parameter use mr.
public class MethodReference {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Jackson", "Michael"), new Person("James", "LeBron"), new Person("Clark", "James"),
                new Person("Eastwood", "Clint"), new Person("Brown", "Gordon"));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        System.out.println("Sum of all numbers: " + numbers.stream().reduce(0, Integer::sum));
        System.out.println("String concatenation: " + numbers.stream().map(String::valueOf).reduce("", String::concat));

        //        printConditionally(people, p->p.getLastName().startsWith("M"),p-> System.out.println(p));
        //        printConditionally(people, p->p.getLastName().startsWith("M"),System.out::println);
        printConditionally(people, p -> p.getLastName().startsWith("M"), MethodReference::printHello);
    }

    public static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person p : people) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }

    public static void printHello(Person person) {
        System.out.println("Hello! " + person.getFirstName());
    }
}
