package com.yyzm.mvp.presenter;

import com.yyzm.mvp.model.Bmodel_interface;
import com.yyzm.mvp.view.Bview_interface;

import java.lang.ref.WeakReference;

/**
 * @作者 11587
 * @描述 Bpresenter
 * @创建时间 2019/2/21 20:47
 */
public abstract class Bpresenter<M extends Bmodel_interface, V extends Bview_interface> implements Bpresenter_interface<M, V> {

    /**
     * 使用弱引用来防止内存泄漏
     * <p>
     * 在MVP模式中，内存泄漏的主要原因是由于当前View层（如Activity或者Fragment）在卸载时，
     * Model层中仍有业务没有结束（如子线程未完成、网络请求超时等），
     * 而这里的Presenter层中拥有Mode层和View层的引用，
     * 所以Presenter层也暂时无法释放，
     * 最终导致View的引用也没有释放，
     * 我们的Activity或者Fragment就算时销毁了，
     * GC也无法回收它们，因为还有引用在指向它们呢。
     */
    private WeakReference<V> wrf_view;
    private M model;

    @Override
    public void registerModel(M model) {
        this.model = model;
    }

    @Override
    public void registerView(V view) {
        wrf_view = new WeakReference<V>(view);
    }

    @Override
    public V getView() {
        return wrf_view == null ? null : wrf_view.get();
    }

    @Override
    public void destroyView() {
        if (wrf_view != null) {
            wrf_view.clear();
            wrf_view = null;
        }
        onDestroyView();
    }

    protected abstract void onDestroyView();
}
