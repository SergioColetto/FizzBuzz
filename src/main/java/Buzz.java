import java.util.function.Predicate;

public class Buzz extends Rule {

    private static Predicate<Integer> predicateBuzz = number -> ((number % 3) == 0);

    @Override
    public String verificar(Integer number) {
        if ( predicateBuzz.test( number )) return "Buzz";
        return next
                .map( rule -> rule.verificar(number))
                .orElse( number.toString() );
    }
}
