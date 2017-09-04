package com.example.thinhhoang.chat

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        txtRegister.setOnClickListener {
            startActivity(Intent(this@LoginActivity, RegisterActivity::class.java))
            overridePendingTransition(R.anim.slide_right_to_left_in,R.anim.slide_right_to_left_out)
        }
        btnLogin.setOnClickListener {
            startActivity(Intent(this@LoginActivity, MainActivity::class.java))
            overridePendingTransition(R.anim.slide_left_to_right_in,R.anim.slide_left_to_right_out)
            finish()
        }
    }
}
