package basic5;

//R/BCA-22-243

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class fibonacciTest {

    @Test
    void testGenerateFibonacciSeries() {
        // Test case for generating Fibonacci series for n = 5
        int n = 5;
        int[] expected = {0, 1, 1, 2, 3};
        int[] result = fibonacci.generateFibonacciSeries(n);
        assertArrayEquals(expected, result);

        
    }
}
