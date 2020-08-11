package com.xiaoyu.lazyloading

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.xiaoyu.lazyloadingview.viewimpl.LazyLoadingFragment
import kotlinx.android.synthetic.main.layout_viewpager.*

class MainFragment : LazyLoadingFragment() {

    companion object {
        @JvmStatic
        fun newInstance() = MainFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.layout_viewpager, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fragment = arrayOf(
            SubFragment.newInstance("Sub1"),
            SubFragment.newInstance("Sub2"),
            SubFragment.newInstance("Sub3")
        )
        viewpager.adapter = object : FragmentStateAdapter(this) {
            override fun getItemCount() = fragment.size

            override fun createFragment(position: Int) = fragment[position]
        }
    }
}