package com.workfort.contact.data


/*
*  ****************************************************************************
*  * Created by : Md. Azizul Islam on 10/8/2018 at 12:40 PM.
*  * Email : azizul@w3engineers.com
*  * 
*  * Purpose:
*  *
*  * Last edited by : Md. Azizul Islam on 10/8/2018.
*  * 
*  * Last Reviewed by : <Reviewer Name> on <mm/dd/yy>  
*  ****************************************************************************
*/

class ContactRepository private constructor( private val contactDao: ContactDao){

    companion object {
        @Volatile private var instance : ContactRepository? = null
        fun getInstance(contactDao: ContactDao) = instance?: synchronized(this){
            instance ?: ContactRepository(contactDao).also { instance = it }
        }
    }

    fun getContacts() : List<Contact>{
        val list = ArrayList<Contact>()
        list.add(Contact("Aziz", 27))
        list.add(Contact("Azim", 30))
        return list
    }

}