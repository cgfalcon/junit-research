package codetotest.chap3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author: Falcon
 * @date: 2014/3/19.
 */
public class DefaultControllerTest {

    private DefaultController controler;

    // ============================================
    //     TEST SAMPLE CLASS
    // ============================================

    private class SampleRequest implements Request {
        public String getName() {
            return "Test";
        }
    }

    private class SampleRequestHandler implements RequestHandler {
        public Response process(Request request) throws Exception {
            return new SampleResponse();
        }
    }

    private class SampleResponse implements Response {

    }

    @Before
    public void setUp() throws Exception {
        controler = new DefaultController();
    }

    @Test(expected = RuntimeException.class)
    public void testMethod() {
        throw new RuntimeException("Unimplemented method");
    }

    @Test
    public void testAddHandler() {
        // Test: a request add to controler should be same with
        Request request = new SampleRequest();
        RequestHandler handler = new SampleRequestHandler();
        controler.addHandler(request, handler);
        RequestHandler hanlder2 = controler.getHandler(request);
        assertSame("Hanlder should be same", handler, hanlder2);
    }
}
