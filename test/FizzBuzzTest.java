import org.junit.Assert;
import org.junit.Test;
public class FizzBuzzTest {
    @Test
    public void returnFizz()
    {
        Assert.assertEquals("Fizz",NumbersExercicies.returnFizzOrBuzzOrFizzBuzz(3));
    }
    @Test
    public void returnBuzz()
    {
        Assert.assertEquals("Buzz",NumbersExercicies.returnFizzOrBuzzOrFizzBuzz(5));
    }
    @Test
    public void returnFizzBuzz()
    {
        Assert.assertEquals("FizzBuzz",NumbersExercicies.returnFizzOrBuzzOrFizzBuzz(15));
    }
}
