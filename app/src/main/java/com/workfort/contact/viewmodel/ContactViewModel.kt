package com.workfort.contact.viewmodel

import android.arch.lifecycle.MediatorLiveData
import android.arch.lifecycle.Transformations
import android.arch.lifecycle.ViewModel
import com.workfort.contact.data.Contact
import com.workfort.contact.data.ContactRepository


/*
*  ****************************************************************************
*  * Created by : Md. Azizul Islam on 10/8/2018 at 1:08 PM.
*  * Email : azizul@w3engineers.com
*  * 
*  * Purpose:
*  *
*  * Last edited by : Md. Azizul Islam on 10/8/2018.
*  * 
*  * Last Reviewed by : <Reviewer Name> on <mm/dd/yy>  
*  ****************************************************************************
*/

class ContactViewModel internal constructor(private val repository: ContactRepository):ViewModel(){
    private val plantList = MediatorLiveData<List<Contact>>()


}