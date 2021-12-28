package ImperativeFunctions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        //function
        int resultWithFunction = addAndThenMultyByTen.apply(1);
        System.out.println(resultWithFunction);
        int resultBiFunction = addByOneAndMultiply.apply(10,2);
        System.out.println(resultBiFunction);

        //bifunction
    }

    static Function<Integer,Integer> incrementByOneFunction = number -> number+1;
    static Function<Integer, Integer> multyplyByTen = number -> number*10;
    static Function<Integer, Integer> addAndThenMultyByTen = incrementByOneFunction.andThen(multyplyByTen);
    static BiFunction<Integer, Integer, Integer> addByOneAndMultiply =
            (numberToAdd, numberToMulti) -> (numberToAdd+1)*numberToMulti;

}
