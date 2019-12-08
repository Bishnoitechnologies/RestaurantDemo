package com.bdtech.restaurant.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bdtech.restaurant.R
import com.bdtech.restaurant.controller.MenuAdapter
import com.bdtech.restaurant.view.activity.MainActivity
import kotlinx.android.synthetic.main.fragment_menu.*
import kotlinx.android.synthetic.main.layout_topbar.*

class MenuFragment : BaseFragment() {
    var myView: View? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if (myView == null) {
            myView = inflater.inflate(R.layout.fragment_menu, container, false)
        }

        return myView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rv_menu.adapter =  MenuAdapter(context!!)
        tv_back.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        super.onClick(v)
        when(v!!.id){
            R.id.tv_back -> {
                MainActivity.getInstance().replaceFragment(HomeFragment())
            }
        }
    }
}