import java.util.function.Predicate;

public class Four extends Rule {

    private static Predicate<Integer> predicateBuzz = number -> ((number % 4) == 0);

    @Override
    public String verificar(Integer number) {
        if ( predicateBuzz.test( number )) return "Four";
        return next
                .map( rule -> rule.verificar(number))
                .orElse( number.toString() );
    }
}
