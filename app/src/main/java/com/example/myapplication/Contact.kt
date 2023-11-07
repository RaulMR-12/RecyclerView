package com.example.myapplication

class Contact(val name: String, val isOnline: Boolean) {

    private var lastContactId = 0;

    fun createContactList(numContact: Int) : ArrayList<Contact> {
        val contact = ArrayList<Contact>()

        for (i in 1..numContact){
            contact.add(Contact("Person " + ++lastContactId, i<=numContact/2))
        }
        return contact
    }

}