package codetotest;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-8-13
 * Time: ??8:43
 * To change this template use File | Settings | File Templates.
 */


public class CalculatorTest {

    @Test
    public void testAdd() throws Exception {
        Calculator calculator = new Calculator();
        double result = calculator.add(10, 50);
        assertEquals("Not Equal",60, result, 0);
    }
}
