package functionalinterface;

import java.util.function.Function;
import java.util.function.LongToDoubleFunction;

public class _Function {
    static Function<Integer, Integer> incrementByOne = num -> ++num;

    static Function<Integer, Integer> multiplyByTen = num -> num * 10;

    public static void main(String[] args) {
        LongToDoubleFunction me = l -> l;

        double v = me.applyAsDouble(10);
        System.out.println(v);

        System.out.println(incrementByOne.andThen(multiplyByTen).andThen(multiplyByTen).apply(2));
    }
}
