package builder;

/**
 * Created by wxk on 2018/5/14.
 */

public interface IBuilder {
    public IBuilder setName(String name);

    public IBuilder setSex(boolean sex);

    public IBuilder setAge(int age);

    public IBuilder setHeight(float height);

    public IBuilder setWeight(float weight);

    public User create();
}
