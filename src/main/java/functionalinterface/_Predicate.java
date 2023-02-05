package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isEvenNumber.test(4));

        System.out.println(isEvenNumber.negate().test(5));
    }

    static Predicate<Integer> isEvenNumber = num -> num % 2 == 0;
}
