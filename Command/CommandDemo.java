package Command;

/**
 * Created by wxk on 2018/5/3.
 * ·Client（客户端）：此处为我们自己，创建一个具体命令(TwoCommand)对象并确定其接收者。
 *·Invoker（请求者）：关机键，负责调用命令对象执行请求，相关的方法叫做行动方法。
 *·Command（命令）：声明了一个给所有具体命令类的抽象接口。
 *·TwoCommand（具体命令）：调用关机的操作。
 *·Receicer（接收者）：实现关机的操作。
 */

public class CommandDemo {
    public static void main(String args[]){
        Invoker invoker = new Invoker(new OneCommand(new Receiver()));
        invoker.action();
        Command command = new TwoCommand(new Receiver());
        invoker = new Invoker(command);
        invoker.action();
        invoker.allAction();
        invoker.removeAction(command);
        invoker.allAction();
    }
}
