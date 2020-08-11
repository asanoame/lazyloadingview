package com.xiaoyu.lazyloadingview

interface LazyLoadingView {

    /**
     *是否加载数据 默认为true
     */
    var isLoadData: Boolean

    /**
     * 开始加载 只有在[isLoadData] 为true的时候才会调用
     */
    fun onLoadStart()

    /**
     * 停止加载 只有在[isLoadData] 为true的时候才会调用
     */
    fun onLoadStop()

    /**
     *加载结束 再加载结束后调用 相对应的 [isLoadData] 设置为false
     */
    fun loadFinish()
}