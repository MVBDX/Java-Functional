package functionalinterface;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBUrl.get());
    }

    static Supplier<String> getDBUrl = () -> "https://www.google.com";
}
