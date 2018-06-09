package com.pioneer.polaris.polaris.demo.Proxy;

import android.widget.CheckBox;

/**
 * Created by wxk on 2018/5/3.
 */

public class Lawyer implements ILawsuit {
    private ILawsuit civilian;

    public Lawyer(ILawsuit civilian) {
        this.civilian = civilian;
    }

    @Override
    public void submit() {
        civilian.submit();
    }

    @Override
    public void burden() {
        civilian.burden();
    }

    @Override
    public void defend() {
        civilian.defend();
    }

    @Override
    public void finish() {
        civilian.finish();
    }
}
