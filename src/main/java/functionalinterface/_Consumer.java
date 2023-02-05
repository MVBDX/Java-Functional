package functionalinterface;

import java.util.function.BiConsumer;

public class _Consumer {
    public static void main(String[] args) {
        greetings.accept("Yashar", 34);
    }

    static BiConsumer<String, Integer> greetings = (name, age) ->
            System.out.println("Hello " + name + " with age of " + age);
}
