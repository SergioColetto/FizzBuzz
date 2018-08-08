import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FizzBuzzTest {

    private RulePredicate rule;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void init(){
        this.rule = RulePredicate.create();
    }

    @Test
    public void deveVerificarOsDefault(){
        Assert.assertEquals("1", rule.verify(1));
        Assert.assertEquals("2", rule.verify(2));
        Assert.assertEquals("Buzz", rule.verify(3));
        Assert.assertEquals("4", rule.verify(4));
        Assert.assertEquals("Fizz", rule.verify(5));
        Assert.assertEquals("Buzz", rule.verify(6));
        Assert.assertEquals("7", rule.verify(7));
        Assert.assertEquals("8", rule.verify(8));
        Assert.assertEquals("Buzz", rule.verify(9));
        Assert.assertEquals("Fizz", rule.verify(10));
        Assert.assertEquals("11", rule.verify(11));
        Assert.assertEquals("Buzz", rule.verify(12));
        Assert.assertEquals("13", rule.verify(13));
        Assert.assertEquals("14", rule.verify(14));
        Assert.assertEquals("FizzBuzz", rule.verify(15));
        Assert.assertEquals("16", rule.verify(16));
        Assert.assertEquals("17", rule.verify(17));
        Assert.assertEquals("Buzz", rule.verify(18));
        Assert.assertEquals("19", rule.verify(19));
        Assert.assertEquals("Fizz", rule.verify(20));
    }

    @Test
    public void deveVerificarUmaNovaRegraSeven(){
        Seven seven = new Seven();
        rule.addRule(seven);
        Assert.assertEquals("1", rule.verify(1));
        Assert.assertEquals("2", rule.verify(2));
        Assert.assertEquals("Seven", rule.verify(7));
        Assert.assertEquals("Seven", rule.verify(14));
    }

    @Test
    public void deveVerificarUmaNovaRegraFour(){
        Four four = new Four();
        rule.addRule(four);
        Assert.assertEquals("1", rule.verify(1));
        Assert.assertEquals("2", rule.verify(2));
        Assert.assertEquals("Four", rule.verify(4));
        Assert.assertEquals("Four", rule.verify(8));
    }

    @Test
    public void deveVerificarUmaNovaRegraNula(){
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("Regra não pode ser nula");
        rule.addRule(null);
    }
}
