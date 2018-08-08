import java.util.Optional;

public abstract class Rule {

    protected Optional<Rule> next = Optional.empty();

    public void setNext(Rule next) {
        this.next = Optional.ofNullable( next );
    }

    public abstract String verificar(Integer number );

}
