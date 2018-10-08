package com.workfort.contact.utils

import android.content.Context
import com.workfort.contact.data.ContactRepository
import com.workfort.contact.factory.ContactViewModelFactory


/*
*  ****************************************************************************
*  * Created by : Md. Azizul Islam on 10/8/2018 at 12:47 PM.
*  * Email : azizul@w3engineers.com
*  * 
*  * Purpose:
*  *
*  * Last edited by : Md. Azizul Islam on 10/8/2018.
*  * 
*  * Last Reviewed by : <Reviewer Name> on <mm/dd/yy>  
*  ****************************************************************************
*/

object InjectorUtils {

    fun getContactRepository(context: Context) :ContactRepository{
        return ContactRepository.getInstance(null!!)
    }

    fun getContactViewModelFactory(context: Context):ContactViewModelFactory{
        val repository = getContactRepository(context)
        return ContactViewModelFactory(repository)
    }
}