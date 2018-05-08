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
    @Test
    public void printDiamondWithName()
    {
        Assert.assertEquals("  *\n" +
                " ***\n" +
                "Bill\n"+
                " ***\n"+
                "  *",MakeDiamond.printDiamondByIndexWithName(3));
    }
}
