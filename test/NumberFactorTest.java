import org.junit.Assert;
import org.junit.Test;
public class NumberFactorTest {
    @Test
    public void returnEmptyArrayResult()
    {
        Assert.assertArrayEquals(new int[]{},NumbersExercicies.returnFactorByNumber(1));
    }

    @Test
    public void returnArrayWithResult()
    {
        Assert.assertArrayEquals(new int[]{2,3,5},NumbersExercicies.returnFactorByNumber(30));
    }
}
