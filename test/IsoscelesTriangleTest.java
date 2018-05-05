import org.junit.Assert;
import org.junit.Test;
public class IsoscelesTriangleTest {
    @Test
    public void printBasicTriangle()
    {
        Assert.assertEquals("*",MakeTriangle.IsoscelesTriangleByIndex(1));
    }
    @Test
    public void printTriangleByIndex()
    {
        Assert.assertEquals(' ' + "*" + '\n' + "***",MakeTriangle.IsoscelesTriangleByIndex(2));
    }
    @Test
    public void printTriangleWith3Height()
    {
        Assert.assertEquals("  *\n" +
                                     " ***\n" +
                                     "*****",MakeTriangle.IsoscelesTriangleByIndex(3));
    }
}
