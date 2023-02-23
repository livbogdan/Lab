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
    println("Checking")
    for (x in AcoountManager.allUsers){
        println(x.name)
        println(userName)
        if (x.name == userName && x.password == password ){

            AcoountManager.currentUser = x

            return true
        }

    }
    return false
}