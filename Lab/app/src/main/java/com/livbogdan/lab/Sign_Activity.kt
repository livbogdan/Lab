package com.livbogdan.lab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.livbogdan.lab.databinding.ActivitySignBinding

class Sign_Activity : AppCompatActivity() {

    //private lateinit var emailEditText: EditText
    //private lateinit var passwordEditText: EditText
    private lateinit var binding: ActivitySignBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_sign)
        binding = ActivitySignBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val email = binding.SignEmailAddress
        val password = binding.SignTextPassword

        //emailEditText = findViewById(R.id.SignEmailAddress)
        //passwordEditText = findViewById(R.id.SignTextPassword)

        //val signInButton: Button = findViewById(R.id.signinbtn)

        binding.signinbtn.setOnClickListener {

            if (email.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()) {
                AcoountManager.addUser(User(email.text.toString(), password.text.toString()))
                val confirm = Intent(this,Login_Activity::class.java)
                startActivity(confirm)
            }
            else
            {
                println("no username")
            }
        }

    }
}