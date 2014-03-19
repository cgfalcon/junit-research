package codetotest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author: Falcon
 * @date: 14-3-15.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses(value={CalculatorTest.class, ParameterizedTest.class})
public class SuiteTest {
}
