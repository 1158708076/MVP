package com.yyzm.mvp.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;

import com.yyzm.mvp.Bmvp;
import com.yyzm.mvp.model.Bmodel_interface;
import com.yyzm.mvp.presenter.Bpresenter_interface;
import com.yyzm.mvp.view.Bview_interface;

public abstract class BmvpFragment<M extends Bmodel_interface, V extends Bview_interface, P extends Bpresenter_interface> extends Fragment implements Bmvp<M, V, P> {


    private P presenter;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        //创建presenter
        presenter = createPresenter();
        if (presenter != null) {
            presenter.registerModel(createModel());
            presenter.registerView(createView());
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (presenter != null) {
            presenter.destroyView();
        }
    }
}
