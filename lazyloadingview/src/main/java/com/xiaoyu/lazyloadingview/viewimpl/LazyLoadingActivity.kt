package com.xiaoyu.lazyloadingview.viewimpl

import androidx.appcompat.app.AppCompatActivity
import com.xiaoyu.lazyloadingview.LazyLoadingView

open class LazyLoadingActivity : AppCompatActivity(), LazyLoadingView {

    private var isLoad = true

    override fun onResume() {
        super.onResume()
        if (isLoad) {
            onLoadStart()
            loadFinish()
        }
    }

    override fun onPause() {
        super.onPause()
        if (isLoad) {
            onLoadStop()
        }
    }

    override var isLoadData = isLoad

    override fun onLoadStart() {

    }

    override fun onLoadStop() {

    }

    override fun loadFinish() {
        isLoad = true
    }
}