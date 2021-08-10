package Strategy;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by wxk on 2018/5/2.
 * 策略模式
 */

public class StrategyDemo {

    public static void main(String args[]){
        TravelContext travelContext = new TravelContext();
        travelContext.setStrategy(new SubwayStrategy());
        travelContext.travel();
        travelContext.setStrategy(new PlaneStrategy());
        travelContext.travel();
        travelContext.setStrategy(new WalkStrategy());
        travelContext.travel();
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("10s");
            }
        };
        timer.schedule(timerTask,10000);
    }

}
