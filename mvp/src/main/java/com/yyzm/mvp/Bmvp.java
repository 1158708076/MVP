package com.yyzm.mvp;

import com.yyzm.mvp.model.Bmodel_interface;
import com.yyzm.mvp.presenter.Bpresenter_interface;
import com.yyzm.mvp.view.Bview_interface;

/**
 *@作者 11587
 *@描述 Bmvp
 *@创建时间 2019/2/21 21:27
 */
public interface Bmvp<M extends Bmodel_interface, V extends Bview_interface, P extends Bpresenter_interface> {

    M createModel();

    V createView();

    P createPresenter();

}
