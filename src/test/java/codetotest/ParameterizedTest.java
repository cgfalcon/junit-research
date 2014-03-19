package codetotest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-8-13
 * Time: ??8:48
 * To change this template use File | Settings | File Templates.
 */

@RunWith(value=Parameterized.class)
public class ParameterizedTest {

    @Parameterized.Parameter(0)
    public double expected;

    @Parameterized.Parameter(1)
    public double valueOne;

    @Parameterized.Parameter(2)
    public double valueTwo;

    @Parameterized.Parameters
    public static Collection<Integer[]> getTestParameters() {
        return Arrays.asList(new Integer[][]{
                {1, 0, 1},
                {10, 8, 2},
                {4, 2, 2}

        });
    }

//    public ParameterizedTest(double expected, double valueOne, double valueTwo) {
//        this.expected = expected;
//        this.valueOne = valueOne;
//        this.valueTwo = valueTwo;
//    }

    @Test
    public void testSum() {
        Calculator calc = new Calculator();
        System.out.println("v1: " + valueOne + " , v2: " + valueTwo);
        assertEquals(expected,calc.add(valueOne, valueTwo), 0);
    }


}
