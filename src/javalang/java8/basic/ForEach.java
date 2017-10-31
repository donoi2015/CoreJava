package javalang.java8.basic;

import javalang.java8.basic.model.Person;

import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Jackson", "Michael"), new Person("James", "LeBron"), new Person("Clark", "James"),
                new Person("Eastwood", "Clint"), new Person("Brown", "Gordon"));

        //        for (int i = 0; i < people.size(); i++) {
        //            System.out.println(people.get(i));
        //        }
        //
        //        for (Person p : people){
        //            System.out.println(p);
        //        }

        //        people.forEach(person -> System.out.println(person));
        people.forEach(System.out::println);
    }
}
