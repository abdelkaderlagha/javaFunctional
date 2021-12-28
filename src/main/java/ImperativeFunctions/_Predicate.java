package ImperativeFunctions;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneValid("92000124"));
        System.out.println(isPhoneValid("9800124"));


        System.out.println(isPhoneValidPredicate.test("92000124"));

       boolean test = isPhoneValidPredicate.or(containsThree).test("92000124");
        System.out.println("final test:"+test);
    }

    static Boolean isPhoneValid(String phoneNumber){
        return phoneNumber.startsWith("92") && phoneNumber.length()==8;
    }
    static Predicate<String> isPhoneValidPredicate = number ->
        number.length()==8 && number.startsWith("92");

    static Predicate<String> containsThree = number ->
            number.contains("3");
}
