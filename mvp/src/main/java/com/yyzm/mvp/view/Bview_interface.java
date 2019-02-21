package com.yyzm.mvp.view;

/**
 * @作者 11587
 * @描述 Bview_interface(V层展示界面)对应于Activity，fragment，负责View的绘制以及与用户交互
 * @创建时间 2019/2/21 20:23
 */
public interface Bview_interface<T> {

    /**
     * MVP以view为核心，故view中要有对present的引用
     *
     * @param presenter 控制层
     */
    void setPresent(T presenter);


}
