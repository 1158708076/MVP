package com.yyzm.mvp.presenter;

import com.yyzm.mvp.model.Bmodel_interface;
import com.yyzm.mvp.view.Bview_interface;

/**
 * @作者 11587
 * @描述 Bpresenter_interface
 * @创建时间 2019/2/21 20:37
 */
public interface Bpresenter_interface<M extends Bmodel_interface, V extends Bview_interface> {

    void registerModel(M model);

    void registerView(V view);

    void getDatatoNet(M model);

    V setView();

    void destroyView();

}
