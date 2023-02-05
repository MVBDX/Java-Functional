package streams;

import java.util.List;
import java.util.stream.Collectors;

import static streams._Stream.Sex.FEMALE;
import static streams._Stream.Sex.MALE;

public class _Stream {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Mohammad", "Faalian", 34, MALE),
                new Person("Amirali", "Nejad", 8, MALE),
                new Person("Mahboub", "Tabasi", 29, FEMALE)
        );

        people.stream()
                .map(person -> person.age)
                .forEach(System.out::println);

    }

    static class Person {
        private String name;
        private String lastName;
        private int age;
        private Sex sex;

        public Person(String name, String lastName, int age, Sex sex) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
        }
    }

    enum Sex {
        MALE, FEMALE;
    }

}
