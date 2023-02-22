package com.livbogdan.lab

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val button: Button = findViewById(R.id.sign_in_button)

        val testUsername: String = "nonusername@gmail.com"

        button.setOnClickListener {
            onMatch(testUsername)
            val  intent = Intent(this, Sign_Activity::class.java)
            startActivity(intent)

        }


    }



    open fun onMatch(username: String) {

        val textId = findViewById<EditText>(R.id.email_edit_text)
        val textPass = findViewById<EditText>(R.id.password_edit_text)


        println(  "username ${textId.text.toString() == username}")

        if (textId.text.toString() == username && textPass.text.toString() == "password") {
            Toast.makeText(this, "Login Successfully.", Toast.LENGTH_LONG).show()
            return

        } else {
            Toast.makeText(this,"Login failed",Toast.LENGTH_LONG).show()
        }

    }


}