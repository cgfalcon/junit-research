package codetotest.chap3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Falcon
 * @date: 2014/3/19.
 */
public class DefaultControler implements Controler {

    private Map<String, RequestHandler> handlerMap = new HashMap<String, RequestHandler>();

    protected RequestHandler getHandler(Request request) {
        if (!handlerMap.containsKey(request.getName())) {
            throw new RuntimeException("Cannot find handerl for request:" + request.getName());
        }
        return handlerMap.get(request.getName());
    }

    public Response process(Request request) {
        Response response;
        try {
            response = getHandler(request).process(request);
        } catch (Exception e) {
            response = new ErrorResponse(request, e);
        }
        return response;
    }

    public void addHandler(Request request, RequestHandler handler) {
        if (handlerMap.containsKey(request.getName())) {
            throw new RuntimeException("A requesthander has already been registered for request name:" + request.getName());
        } else {
            handlerMap.put(request.getName(), handler);
        }
    }
}
