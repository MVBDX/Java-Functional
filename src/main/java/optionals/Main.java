package optionals;

import lombok.RequiredArgsConstructor;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Object o = Optional.ofNullable(null)
                .orElseGet(() -> "Nothing");

        System.out.println(o);

        Optional.ofNullable(null)
                .ifPresentOrElse(System.out::println,
                        () -> System.out.println("boom")
                );

        Person person = new Person("yashar", null);
        System.out.println(person.getEmail().orElse("email not provided"));
    }
}


@RequiredArgsConstructor
class Person {
    private final String name;
    private final String email;

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
}