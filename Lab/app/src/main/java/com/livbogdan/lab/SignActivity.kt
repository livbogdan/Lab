package com.livbogdan.lab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.livbogdan.lab.databinding.ActivitySignBinding

class SignActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val email = binding.SignEmailAddress
        val password = binding.SignTextPassword


        binding.signinbtn.setOnClickListener {

            if (email.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()) {
                AcoountManager.addUser(User(email.text.toString(), password.text.toString()))
                val confirm = Intent(this,LoginActivity::class.java)
                startActivity(confirm)
            }
            else
            {
                println("no username")
            }
        }

    }
}