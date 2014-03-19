package codetotest.chap3;

/**
 * @author: Falcon
 * @date: 2014/3/19.
 */
public interface Controler {

    Response process(Request request);

    void addHandler(Request request, RequestHandler handler);
}
