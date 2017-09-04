package com.example.thinhhoang.chat

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        initToolbar()
    }

    private fun initToolbar() {
        val toolbar_register: Toolbar = findViewById(R.id.toolbar_register)
        toolbar_register.setNavigationIcon(R.drawable.back)
        toolbar_register.setNavigationOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.slide_left_to_right_in, R.anim.slide_left_to_right_out)
    }
}
