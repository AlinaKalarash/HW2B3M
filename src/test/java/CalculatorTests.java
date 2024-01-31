import org.example.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTests {
    private SumCalculator calc;

    @BeforeEach
    public void beforeEach() {
        calc = new SumCalculator();
    }
    @Test
    public void testThatSumWorksCorrectWith1() {
        Assertions.assertEquals(1, calc.sum(1));
    }

    @Test
    public void testThatSumWorksCorrectWith3() {
        Assertions.assertEquals(6, calc.sum(3));
    }

    @Test
    public void testThatSumThrowsCorrectExceptions() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calc.sum(0);
        });
    }
}
