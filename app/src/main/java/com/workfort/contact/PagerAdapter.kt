package com.workfort.contact

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter


/*
*  ****************************************************************************
*  * Created by : Md. Azizul Islam on 10/5/2018 at 6:10 PM.
*  * Email : azizul@w3engineers.com
*  * 
*  * Purpose:
*  *
*  * Last edited by : Md. Azizul Islam on 10/5/2018.
*  * 
*  * Last Reviewed by : <Reviewer Name> on <mm/dd/yy>  
*  ****************************************************************************
*/

class PagerAdapter : FragmentPagerAdapter {
    var itemCount: Int

    constructor(fragmentManager: FragmentManager, count: Int) : super(fragmentManager) {
        this.itemCount = count
    }

    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return RecentFragment.newInstance("RecentFragment", "RecentFragment")
            1 -> return BlockContactFragment.newInstance("BlockContactFragment", "BlockContactFragment")
            2 -> return RejectWithSmsFragment.newInstance("RejectWithSmsFragment", "RejectWithSmsFragment")
            else -> return null!!
        }

    }

    override fun getCount(): Int {
        return itemCount
    }
}