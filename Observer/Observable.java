package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wxk on 2018/5/2.
 */

public class Observable<T> {

    List<Observer<T>> observers;

    public void register(Observer<T> observer){
        if (observer == null){
            throw new NullPointerException("observer == null");
        }
        if (observers == null){
            observers = new ArrayList<>();
        }
        synchronized (this){
            if (!observers.contains(observer)){
                observers.add(observer);
            }
        }
    }
    public synchronized void unRegister(Observer<T> observer){
        if (observers != null) {
            observers.remove(observer);
        }
    }
    public void notifyObserver(T date,Observer ob){
        if (observers != null) {
            for (Observer<T> observer : observers) {
                if (ob!= null && observer.equals(ob)){
                    observer.upDate(this, date);
                }else {
                    observer.upDate(this, date);
                }
            }
        }
    }
}
