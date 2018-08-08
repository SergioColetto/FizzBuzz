public class RulePredicate {

    private static Rule regra;
    private static Rule fizzBuzz;

    private RulePredicate(){}

    public static RulePredicate create(){
        fizzBuzz = new FizzBuzz();
        Fizz fizz = new Fizz();
        Buzz buzz = new Buzz();

        fizzBuzz.setNext(fizz);
        fizz.setNext(buzz);
        regra = buzz;
        return new RulePredicate();
    }

    public RulePredicate addRule(Rule rule){
        if (rule == null) throw new RuntimeException("Regra não pode ser nula");
        regra.setNext( rule );
        regra = rule;
        return this;
    }

    public String verify(Integer number){
       return fizzBuzz.verificar(number);
    }

}
