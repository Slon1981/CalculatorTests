import org.junit.Assert;
import org.junit.Test;

public class CalculatorTests {


    @Test
    public void addTest() {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);

        Assert.assertEquals(3, a);
    }


    @Test
    public void minusTest() {
        Calculator calc = Calculator.instance.get();

        int a = calc.minus.apply(2, 2);

        Assert.assertEquals(0, a);
    }


    @Test
    public void divTest() {
        Calculator calc = Calculator.instance.get();

        Integer a = calc.devide.apply(2, 0);

        Assert.assertEquals(null, a);
    }

}
