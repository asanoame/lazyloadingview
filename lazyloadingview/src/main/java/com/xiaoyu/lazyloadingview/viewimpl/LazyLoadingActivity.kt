package com.xiaoyu.lazyloadingview.viewimpl

import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.xiaoyu.lazyloadingview.BuildConfig
import com.xiaoyu.lazyloadingview.LazyLoadingView

open class LazyLoadingActivity : AppCompatActivity(), LazyLoadingView {

    private var isLoadFinish = false

    override fun onResume() {
        super.onResume()
        if (isLoadData) {
            log("${javaClass.simpleName} : onLoadStart")
            onLoadStart()
        }
    }

    override fun onPause() {
        super.onPause()
        if (isLoadData) {
            log("${javaClass.simpleName} : onLoadStop")
            onLoadStop()
        }
    }

    override var isLoadData = !isLoadFinish

    override fun onLoadStart() {

    }

    override fun onLoadStop() {

    }

    override fun loadFinish() {
        isLoadFinish = true
    }

    private fun log(msg: String) {
        if (BuildConfig.DEBUG) {
            Log.e("LazyLoadingView", msg)
        }
    }
}