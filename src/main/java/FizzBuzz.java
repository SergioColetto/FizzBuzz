import java.util.List;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;

public class FizzBuzz {

    private static Predicate<Integer> predicateFizzBuzz = number -> ((number % 15) == 0);
    private static Predicate<Integer> predicateFizz = number -> ((number % 5) == 0);
    private static Predicate<Integer> predicateBuzz = number -> ((number % 3) == 0);

    public static String verificar( Integer number){
        if ( predicateFizzBuzz.test( number )) return "FizzBuzz";
        if ( predicateFizz.test( number )) return "Fizz";
        if ( predicateBuzz.test( number )) return "Buzz";
        return number.toString();
    }

    public static List<String> filterFizzBuzz(List<Integer> numbers ) {
        return numbers.stream()
                .map( number -> verificar(number))
                .collect(toList());
    }

}
