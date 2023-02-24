package com.livbogdan.lab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.livbogdan.lab.databinding.ActivityLoginBinding

class Login_Activity : AppCompatActivity() {


    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
       /* Saving for future
       super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val button: Button = findViewById(R.id.sign_in_button)
        val emailEditText: EditText = findViewById(R.id.email_edit_text)

        val myusername = binding.
        val mypassword = "password"

        button.setOnClickListener {
            onMatch(myusername, mypassword)
            val  intent = Intent(this, Sign_Activity::class.java)
            startActivity(intent)
        }

        binding.login_buttton.setOnClickListener {
            if (logInCheck(userName.text.toString(),password.text.toString())){
                val goToAboutPage = Intent(this,About_Activity::class.java)
                startActivity(goToAboutPage)
            }
        }
        */

        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val userName = binding.emailEditText
        val password = binding.passwordEditText

        binding.signInButton.setOnClickListener {
            val goToSignUp = Intent(this,Sign_Activity::class.java)
            startActivity(goToSignUp)
            finish()
        }
        binding.loginButton.setOnClickListener {
            if (logInCheck(userName.text.toString(),password.text.toString())){
                val goToAboutPage = Intent(this,ChampionsActivity::class.java)
                startActivity(goToAboutPage)
            }
        }
    }


    /* Svaing for future
   private fun onMatch(username: String, password: String) {

        val textId = findViewById<EditText>(R.id.email_edit_text)
        val textPass = findViewById<EditText>(R.id.password_edit_text)
        println(  "username ${textId.text.toString() == username}")

        if (textId.text.toString() == username && textPass.text.toString() == password) {
            Toast.makeText(this, "Login Successfully.", Toast.LENGTH_LONG).show()
            return

        } else {
            Toast.makeText(this,"Login failed",Toast.LENGTH_LONG).show()
        }

    }
    */
}