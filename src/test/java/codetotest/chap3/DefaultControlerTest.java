package codetotest.chap3;

import org.junit.Before;
import org.junit.Test;

/**
 * @author: Falcon
 * @date: 2014/3/19.
 */
public class DefaultControlerTest {

    private DefaultControler controler;

    // ============================================
    //     TEST SAMPLE CLASS
    // ============================================

    private class SampleRequest implements Request {
        public String getName() {
            return null;
        }
    }

    private class SampleRequestHandler implements RequestHandler {
        public Response process(Request request) throws Exception {
            return null;
        }
    }

    private class SampleResponse implements Response {

    }

    @Before
    public void setUp() throws Exception {
        controler = new DefaultControler();
    }

    @Test(expected = RuntimeException.class)
    public void testMethod() {
        throw new RuntimeException("Unimplemented method");
    }
}
