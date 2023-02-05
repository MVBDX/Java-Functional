package callback;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        hello("Mohammad", null, value -> {
            System.out.println("family is not present for " + value);
        });

        helloTwo("Mohammad", null, () -> {
            System.out.println("family is not present");
        });
    }

    static void hello(String name, String family, Consumer<String> callback) {
        System.out.println(name);
        if (family != null)
            System.out.println(family);
        else
            callback.accept(name);
    }

    static void helloTwo(String name, String family, Runnable callback) {
        System.out.println(name);
        if (family != null)
            System.out.println(family);
        else
            callback.run();
    }
}
