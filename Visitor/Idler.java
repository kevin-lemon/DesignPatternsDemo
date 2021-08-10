package Visitor;

/**
 * Created by wxk on 2018/5/15.
 */

public class Idler implements Visitor {
    @Override
    public void visit(ConcreteElementA music) {
        System.out.print(music.getName());
        music.playMusic();
    }

    @Override
    public void visit(ConcreteElementB video) {
        System.out.print(video.getName());
        video.playVideo();
    }
}
