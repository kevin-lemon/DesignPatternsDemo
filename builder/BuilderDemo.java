package builder;

/**
 * Created by wxk on 2018/5/14.
 */

public class BuilderDemo {
public static void main(String argsp[]){
    User user = new UserBuilder().setName("123").setAge(24).setSex(false).create();
    System.out.print(user.getName()+"->"+user.getAge()+"->"+user.getHeight()+"->"+user.getWeight()+"->"+user.isSex());
}
}
