package com.neppplus.pizzaorderapp_20211211.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.pizzaorderapp_20211211.fragments.MyProfileFragment
import com.neppplus.pizzaorderapp_20211211.fragments.PizzaStoreListFragment

class MainViewPagerAdapter( fm: FragmentManager ) : FragmentPagerAdapter(fm) {
    override fun getCount() = 2

    override fun getItem(position: Int): Fragment {

        return when(position) {

            0 -> PizzaStoreListFragment()
            else -> MyProfileFragment()

        }

    }
}