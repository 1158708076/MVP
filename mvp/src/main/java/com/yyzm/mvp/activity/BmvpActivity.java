package com.yyzm.mvp.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.yyzm.mvp.Bmvp;
import com.yyzm.mvp.model.Bmodel_interface;
import com.yyzm.mvp.presenter.Bpresenter_interface;
import com.yyzm.mvp.view.Bview_interface;

/**
 * @作者 11587
 * @描述 BmvpActivity
 * @创建时间 2019/2/21 21:11
 */
public abstract class BmvpActivity<M extends Bmodel_interface, V extends Bview_interface, P extends Bpresenter_interface> extends AppCompatActivity implements Bmvp<M, V, P> {

    private P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //创建presenter
        presenter = createPresenter();
        if (presenter != null) {
            presenter.registerModel(createModel());
            presenter.registerView(createView());
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter != null) {
            presenter.destroyView();
        }
    }
}
