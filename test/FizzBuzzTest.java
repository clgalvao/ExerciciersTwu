import org.junit.Assert;
import org.junit.Test;
public class FizzBuzzTest {
    @Test
    public void returnFizz()
    {
        Assert.assertEquals("Fizz",AsteriskExercicies.returnFizzOrBuzzOrFizzBuzz(3));
    }
    @Test
    public void returnBuzz()
    {
        Assert.assertEquals("Buzz",AsteriskExercicies.returnFizzOrBuzzOrFizzBuzz(5));
    }
    @Test
    public void returnFizzBuzz()
    {
        Assert.assertEquals("FizzBuzz",AsteriskExercicies.returnFizzOrBuzzOrFizzBuzz(15));
    }
}
