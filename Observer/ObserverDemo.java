package Observer;

/**
 * Created by wxk on 2018/5/2.
 */

public class ObserverDemo {

    public static void main(String args[]){
        Observable<String> observable = new Observable<String>();
        Observer<String> observer = new Observer<String>() {
            @Override
            public void upDate(Observable<String> observable, String date) {
                System.out.println("observer"+date);
            }
        };
        Observer<String> observer1 = new Observer<String>() {
            @Override
            public void upDate(Observable<String> observable, String date) {
                System.out.println("observer1"+date);
            }
        };

        observable.register(observer);
        observable.register(observer1);
        observable.notifyObserver("Notify",null);
        try {
            Thread.sleep(3000);
            observable.notifyObserver("sleep 3000",null);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(3000);
            observable.unRegister(observer1);
            observable.notifyObserver("sleep 6000",null);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
