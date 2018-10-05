package com.workfort.contact.ui.addcontact

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.workfort.contact.R


/*
*  ****************************************************************************
*  * Created by : Md. Azizul Islam on 10/5/2018 at 2:33 PM.
*  * Email : azizul@w3engineers.com
*  * 
*  * Purpose:
*  *
*  * Last edited by : Md. Azizul Islam on 10/5/2018.
*  * 
*  * Last Reviewed by : <Reviewer Name> on <mm/dd/yy>  
*  ****************************************************************************
*/

class FragmentAddContact : Fragment() {
    private var sendValue : String? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        sendValue = FragmentAddContactArgs.fromBundle(arguments).item_value

        return inflater.inflate(R.layout.fragment_add_contact, container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.e("Value_passed", "vlaue ="+sendValue)

    }
}