package com.xiaoyu.lazyloading

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.xiaoyu.lazyloadingview.viewimpl.LazyLoadingActivity
import kotlinx.android.synthetic.main.layout_viewpager.*

class MainActivity : LazyLoadingActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_viewpager)

        val fragment = arrayOf(
            MainFragment.newInstance(),
            SubFragment.newInstance("Main2"),
            SubFragment.newInstance("Main3"),
            SubFragment.newInstance("Main4"),
            SubFragment.newInstance("Main5")
        )
        viewpager.adapter = object : FragmentStateAdapter(this) {
            override fun getItemCount() = fragment.size

            override fun createFragment(position: Int) = fragment[position]
        }
    }
}