import org.junit.Assert;
import org.junit.Test;

public class DiamondTest {

    @Test
    public void printDiamondByIndex()
    {
        Assert.assertEquals("  *\n" +
                " ***\n" +
                "*****\n"+
                " ***\n"+
                "  *",MakeDiamond.printDiamondByIndex(3));
    }
}
