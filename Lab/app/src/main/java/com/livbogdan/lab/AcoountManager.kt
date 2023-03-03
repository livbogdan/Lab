package com.livbogdan.lab

import android.widget.Toast

object AcoountManager {

    var allUsers = arrayOf<User>()
    fun addUser(newUser: User){
        allUsers = arrayOf(newUser, *allUsers)
    }
    var currentUser: User = User("Null","Null")
}


class User (var name: String, var password: String) {
    var house: String = "HufflePuff" //For now every user becomes HufflePuff :)
}

fun logInCheck (userName:String, password: String): Boolean {
    println("Account Checking")
    for (x in AcoountManager.allUsers)
    {
        if (x.name == userName && x.password == password )
        {
            AcoountManager.currentUser = x
            return true
        }
        println("Username is: ${x.name} Password is: ${x.password}")
    }
    return false
}