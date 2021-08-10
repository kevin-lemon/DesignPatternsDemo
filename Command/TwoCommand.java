package Command;

import Decorator.ConcreteComponent;

/**
 * Created by wxk on 2018/5/3.
 * 具体命令
 */

public class TwoCommand implements Command{
    private Receiver receiver;

    public TwoCommand(Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        System.out.println("Two execute");
        receiver.login();
    }
}
