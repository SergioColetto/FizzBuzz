import java.util.function.Predicate;

public class Fizz extends Rule {

    private static Predicate<Integer> predicateFizz = number -> ((number % 5) == 0);

    @Override
    public String verificar(Integer number) {
        if ( predicateFizz.test( number )) return "Fizz";
        return next
                .map( rule -> rule.verificar(number))
                .orElse( number.toString() );
    }
}
