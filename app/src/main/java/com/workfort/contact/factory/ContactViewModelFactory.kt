package com.workfort.contact.factory

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.workfort.contact.data.ContactRepository
import com.workfort.contact.viewmodel.ContactViewModel


/*
*  ****************************************************************************
*  * Created by : Md. Azizul Islam on 10/8/2018 at 1:05 PM.
*  * Email : azizul@w3engineers.com
*  * 
*  * Purpose:
*  *
*  * Last edited by : Md. Azizul Islam on 10/8/2018.
*  * 
*  * Last Reviewed by : <Reviewer Name> on <mm/dd/yy>  
*  ****************************************************************************
*/

class ContactViewModelFactory(private val repository: ContactRepository):ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>)= ContactViewModel(repository) as T
}