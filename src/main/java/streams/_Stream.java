package streams;

import lombok.Getter;
import lombok.ToString;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static streams._Stream.Sex.FEMALE;
import static streams._Stream.Sex.MALE;

public class _Stream {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Mohammad", "Faalian", 34, MALE),
                new Person("Amirali", "Nejad", 8, MALE),
                new Person("Mahboub", "Tabasi", 29, FEMALE),
                new Person("Armin", "Nejadi", 8, MALE)
        );

        people.stream()
                //.filter(person -> person.sex.equals(FEMALE))
                .sorted(Comparator.comparing(Person::getAge))
                        .forEach(System.out::println);

        people.stream()
                .map(person -> person.age)
                .forEach(System.out::println);

        System.out.println(people.stream().allMatch(person -> person.age < 40));

        Optional<Person> max = people.stream()
                .min(Comparator.comparing(Person::getAge));

        max.ifPresent(System.out::println);

        people.stream()
                .collect(Collectors.groupingBy(Person::getAge))
                .forEach((integer, people1) -> System.out.println(integer + " " + people1));

    }

    @Getter
    @ToString
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
