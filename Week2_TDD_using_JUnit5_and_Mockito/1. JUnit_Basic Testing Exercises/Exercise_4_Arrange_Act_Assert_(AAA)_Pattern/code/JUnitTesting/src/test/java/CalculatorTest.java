import org.example.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private  Calculator calculator =  new Calculator();

    @Test
    public void addTest(){
        int addRes = calculator.addition(4,9);
        assertEquals("addition is correct",13,addRes);
    }

    @Test
    public void subTest(){
        int addRes = calculator.subtraction(4,9);
        assertEquals("subtraction is correct",-5,addRes);
    }


}
