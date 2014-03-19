package codetotest.chap3;

/**
 * @author: Falcon
 * @date: 2014/3/19.
 */
public interface Controller {

    Response process(Request request);

    void addHandler(Request request, RequestHandler handler);
}
