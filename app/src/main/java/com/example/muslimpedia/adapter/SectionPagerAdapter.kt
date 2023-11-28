package com.example.muslimpedia.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.muslimpedia.ui.home.AboutAlQuranFragment
import com.example.muslimpedia.ui.home.AlJazeeraFragment
import com.example.muslimpedia.ui.home.CommonFragment
import com.example.muslimpedia.ui.home.WarningForMuslimFragment

class SectionPagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 4

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> CommonFragment()
            1 -> AboutAlQuranFragment()
            2 -> AlJazeeraFragment()
            3 -> WarningForMuslimFragment()
            else -> CommonFragment()
        }
    }
}