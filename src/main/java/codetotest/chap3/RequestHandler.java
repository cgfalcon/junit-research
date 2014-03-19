package codetotest.chap3;

/**
 * @author: Falcon
 * @date: 2014/3/19.
 */
public interface RequestHandler {

    Response process(Request request) throws Exception;
}
