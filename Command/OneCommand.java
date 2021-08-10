package Command;

/**
 * Created by wxk on 2018/5/3.
 */

public class OneCommand implements Command {
    private Receiver receiver;
    public OneCommand(Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        System.out.println("one execute");
        receiver.login();
    }
}
