package Decorator;

/**
 * Created by wxk on 2018/5/3.
 * 在装饰者模式的实现中，为了能够实现和原来使用被装饰对象的代码无缝衔接，
 * 是通过定义一个抽象类，让这个类实现与被装饰对象相同的接口，然后在具体实现类中，
 * 转调被装饰的对象，在转调前后添加新功能，这就实现了给被装饰对象增加功能。
 * 上面这段话最关键的就是-转调。而能转调的实现是定义统一接口。
 */

public abstract class Decorator implements Component{
    private Component component;
    public Decorator(Component component){
        this.component = component;
    }
    @Override
    public void operation() {
        component.operation();
    }
}
