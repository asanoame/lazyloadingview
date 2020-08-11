package com.xiaoyu.lazyloadingview.viewimpl

import androidx.fragment.app.Fragment
import com.xiaoyu.lazyloadingview.LazyLoadingView

open class LazyLoadingFragment : Fragment(), LazyLoadingView {

    private var isLoad = true

    override fun onResume() {
        super.onResume()
        if (isLoad) {
            onLoadStart()
            loadFinish()
        }
    }

    override fun onStop() {
        super.onStop()
        if (isLoad) {
            onLoadStop()
        }
    }

    override var isLoadData: Boolean = isLoad

    override fun onLoadStart() {}

    override fun onLoadStop() {}

    override fun loadFinish() {
        isLoad = false
    }
}