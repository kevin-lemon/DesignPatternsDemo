package Handler;

/**
 * Created by wxk on 2018/5/15.
 */

public class HandlerOne extends Handler {
    @Override
    protected int getHandleLevel() {
        return 1;
    }

    @Override
    protected void handle(Request request) {
        System.out.println("Handler1处理了请求："+request.getRequestLevel());
    }
}
