package javalang.java8.basic;

import javalang.java8.basic.model.Person;

import java.util.Arrays;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<Person> people = Arrays
            .asList(new Person("Jackson", "Michael"), new Person("James", "LeBron"), new Person("Clark", "James"), new Person("Eastwood", "Clint"),
                new Person("Brown", "Gordon"));

        //think of stream as conveyor belt
        people.stream().filter(person -> person.getLastName().startsWith("C")).forEach(System.out::println);

    }
}
