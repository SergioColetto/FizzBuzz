import java.util.Arrays;
import java.util.List;

public class Main {

    private static List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17);

    public static void main(String[] args){

        FizzBuzz.filterFizzBuzz(numeros).forEach(System.out::println);

    }
}
