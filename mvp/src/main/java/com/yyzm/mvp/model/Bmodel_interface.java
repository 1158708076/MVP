package com.yyzm.mvp.model;

/**
 * @作者 11587
 * @描述 Bmodel_interface 业务逻辑和数据处理（数据库存储操作，网络数据请求，复杂算法，耗时操作）
 * @创建时间 2019/2/21 20:08
 */
public interface Bmodel_interface {
    /**
     * 网上获取数据
     */
    void getDatatoNet();

    /**
     * 停止获取
     */
    void stopRequest();

}
