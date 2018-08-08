import java.util.function.Predicate;

public class Seven extends Rule {

    private static Predicate<Integer> predicateBuzz = number -> ((number % 7) == 0);

    @Override
    public String verificar(Integer number) {
        if ( predicateBuzz.test( number )) return "Seven";
        return next
                .map( rule -> rule.verificar(number))
                .orElse( number.toString() );
    }
}
