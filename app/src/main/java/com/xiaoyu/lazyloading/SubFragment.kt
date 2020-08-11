package com.xiaoyu.lazyloading

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.xiaoyu.lazyloadingview.viewimpl.LazyLoadingFragment
import kotlinx.android.synthetic.main.fragment_sub.*


class SubFragment : LazyLoadingFragment() {

    lateinit var key: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        key = arguments?.getString("ARG_PARAM1") ?: ""
        return inflater.inflate(R.layout.fragment_sub, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tip.text = key
    }

    override fun onLoadStart() {
        Log.e("测试", "$key onLoadStart")
    }

    override fun onLoadStop() {
        Log.e("测试", "$key onLoadStop")
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String) =
            SubFragment().apply {
                arguments = Bundle().apply {
                    putString("ARG_PARAM1", param1)
                }
            }
    }
}