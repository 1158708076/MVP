package com.yyzm.mvp.view;

import com.yyzm.mvp.presenter.Bpresenter_interface;

/**
 * @作者 11587
 * @描述 BmvpView
 * @创建时间 2019/2/21 21:26
 */
public abstract class BmvpView<P extends Bpresenter_interface> implements Bview_interface<P> {

    private P presenter;

    @Override
    public void setPresent(P presenter) {
        this.presenter = presenter;
    }
}
