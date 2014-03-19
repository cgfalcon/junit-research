package codetotest.chap3;

/**
 * @author: Falcon
 * @date: 2014/3/19.
 */
public class ErrorResponse implements Response {
    private final Exception originalException;
    private final Request   originalRequest;

    public ErrorResponse(Request request, Exception e) {
        this.originalRequest = request;
        this.originalException = e;
    }

    public Exception getOriginalException() {
        return originalException;
    }

    public Request getOriginalRequest() {
        return originalRequest;
    }
}
