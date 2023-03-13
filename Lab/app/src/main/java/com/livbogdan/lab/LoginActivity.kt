package com.livbogdan.lab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.livbogdan.lab.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {


    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val userName = binding.emailEditText
        val password = binding.passwordEditText

        binding.signInButton.setOnClickListener {
            val goToSignUp = Intent(this,SignActivity::class.java)
            startActivity(goToSignUp)
            finish()
        }

        binding.loginButton.setOnClickListener {
            if (logInCheck(userName.text.toString(),password.text.toString())){
                val goToAboutPage = Intent(this,ChampionsActivity::class.java)
                Toast.makeText(this, "Login Successfully.", Toast.LENGTH_LONG).show()
                startActivity(goToAboutPage)
            }
            else
            {
                Snackbar.make(binding.root,"Login failed",Toast.LENGTH_LONG).show()
            }
        }

        

    }

}