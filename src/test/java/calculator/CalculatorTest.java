package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private Calculator calculator = new Calculator();
    @Test
    void add() {
        float result = calculator.add(2.5f, 3.5f);
        assertEquals(6.0f, result,0.001);
    }

    @Test
    void subtract() {
        float result = calculator.subtract(5.0f, 2.0f);
        assertEquals(3.0f,result,0.001);
    }


    @Test
    void divideByZero() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.divide(10.0f, 0.0f));
    }

    @Test
    void divide() {
        float result = calculator.divide(10.0f, 2.0f);
        assertEquals(5.0f, result);
    }

    @Test
    void multiply() {
        float result = calculator.multiply(2.5f, 4.0f);
        assertEquals(10.0f,result, 0.001);
    }
}