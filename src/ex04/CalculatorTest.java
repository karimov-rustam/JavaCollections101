package ex04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by R.Karimov on 10/18/17.
 */
class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    void shouldEvaluateConstants() {
        int result = calculator.evaluate("1");
        assertEquals(1, result);
    }

    @Test
    void shouldSupportAdding() {
        int result = calculator.evaluate("1 + 2");
        assertEquals(3, result);
    }

    @Test
    void shouldSupportSubtraction() {
        int result = calculator.evaluate("1 - 2");
        assertEquals(-1, result);
    }

    @Test
    void shouldComplexStatements() {
        int result = calculator.evaluate("1 - 3 + 2 + 4");
        assertEquals(4, result);
    }
}