package Strategy;

/**
 * Created by wxk on 2018/5/2.
 */

public class TravelContext {
    private Strategy strategy;
    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void travel(){
        if (strategy !=null){
            strategy.travel();
        }
    }
}
