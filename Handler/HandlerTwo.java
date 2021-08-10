package Handler;

/**
 * Created by wxk on 2018/5/15.
 */

public class HandlerTwo extends Handler {
    @Override
    protected int getHandleLevel() {
        return 2;
    }

    @Override
    protected void handle(Request request) {
        System.out.println("Handler2处理了请求："+request.getRequestLevel());
    }
}
