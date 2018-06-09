package com.pioneer.polaris.polaris.demo.Observer;

/**
 * Created by wxk on 2018/5/2.
 */

public interface Observer<T> {

    void upDate(Observable<T> observable,T date);
}
