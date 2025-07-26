import org.example.Calculator;
import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorAAATest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setting up...");
    }

    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Tearing down...");
    }

    @Test
    public void testAddition() {
        // Arrange done in setUp
        // Act
        int result = calculator.addition(4, 6);
        // Assert
        assertEquals("addition is correct",10, result);
    }

    @Test
    public void testSubtraction() {
        int result = calculator.subtraction(10, 5);
        assertEquals("substraction is correct",5, result);
    }
}
