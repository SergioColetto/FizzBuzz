import java.util.function.Predicate;

public class FizzBuzz extends Rule {

    private static Predicate<Integer> predicateFizzBuzz = number -> ((number % 15) == 0);

    @Override
    public String verificar(Integer number) {
        if ( predicateFizzBuzz.test( number )) return "FizzBuzz";
        return next
                .map( rule -> rule.verificar(number))
                .orElse( number.toString() );
    }

}
