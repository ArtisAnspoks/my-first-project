import lv.acodemy.classroom.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    Calculator casio = new Calculator();

    @Test
    public void testSum(){
        Assert.assertEquals(casio.sum(50,10),60);
    }
    @Test
    public void testDivide(){
        Assert.assertEquals(casio.divide(50,10),5);
    }
    @Test
    public void testMultiply(){
        Assert.assertEquals(casio.multiply(50,10),500);
    }
    @Test
    public void testSubtract(){
        Assert.assertEquals(casio.subtract(50,10),40);
    }
}
