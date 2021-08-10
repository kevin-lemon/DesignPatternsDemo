package Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wxk on 2018/5/3.
 * 请求者
 */

public class Invoker {
    private static List<Command> commands = new ArrayList<>();
    private Command command;
    public Invoker(Command command){
        this.command = command;
            commands.add(command);

    }
    public void removeAction(Command command){
        commands.remove(command);
    }
    public void action(){
            command.execute();
    }
    public void allAction(){
        for (Command command : commands){
            command.execute();
        }
    }
}
