package testing.junit4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void evaluatesExpression() {
        int sum = calculator.evaluate("1+2+3");
        assertEquals(6, sum);
    }
}