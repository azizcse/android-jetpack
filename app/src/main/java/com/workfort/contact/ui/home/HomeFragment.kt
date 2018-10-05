package com.workfort.contact.ui.home

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.workfort.contact.PagerAdapter
import com.workfort.contact.databinding.FragmentHomeBinding


/*
*  ****************************************************************************
*  * Created by : Md. Azizul Islam on 10/5/2018 at 1:02 PM.
*  * Email : azizul@w3engineers.com
*  * 
*  * Purpose:
*  *
*  * Last edited by : Md. Azizul Islam on 10/5/2018.
*  * 
*  * Last Reviewed by : <Reviewer Name> on <mm/dd/yy>  
*  ****************************************************************************
*/

class HomeFragment : Fragment() {
    var binding : FragmentHomeBinding? = null
    var tabLayout : TabLayout? = null
    var viewPager: ViewPager? = null

    companion object {
        fun getInstance(): HomeFragment {
            return HomeFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        //return inflater.inflate(R.layout.fragment_home, container, false)
        binding!!.tabLayout.addTab(binding!!.tabLayout.newTab().setText("Recent"))
        binding!!.tabLayout.addTab(binding!!.tabLayout.newTab().setText("Block"))
        binding!!.tabLayout.addTab(binding!!.tabLayout.newTab().setText("Reject"))
        binding!!.tabLayout.tabGravity = TabLayout.GRAVITY_FILL

        val pagerAdapter = PagerAdapter(activity!!.supportFragmentManager, binding!!.tabLayout.tabCount)

        binding!!.pager.adapter = pagerAdapter
        binding!!.pager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(binding!!.tabLayout))

        binding!!.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                binding!!.pager.setCurrentItem(tab.position)
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {}

            override fun onTabReselected(tab: TabLayout.Tab) {}
        })

        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //binding!!.buttonClick.setOnClickListener { view ->
            //val direction = HomeFragmentDirections.Action_home_fragment_to_fragment().setItem_value("jfnvjfnjfnvjfvn")
            //findNavController().navigate(direction)
        // }

        //val bundle = Bundle()
        //bundle.putString("key", "vlaue")

        //button_click.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_home_fragment_to_fragment, bundle))

        //val direction = HomeFragmentDirections.Action_home_fragment_to_fragment("Send value")
        //findNavController().navigate(direction)
       /* val options = NavOptions.Builder()
                .setEnterAnim(R.anim.slide_in_right)
                .setExitAnim(R.anim.slide_out_left)
                .setPopEnterAnim(R.anim.slide_in_left)
                .setPopExitAnim(R.anim.slide_out_right)
                .build()

        button_click.setOnClickListener({context?.let {NavHostFragment.findNavController(this)
                .navigate(R.id.action_home_fragment_to_fragment, null, options)
            }
        })*/
    }
}