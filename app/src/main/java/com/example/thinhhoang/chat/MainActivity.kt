package com.example.thinhhoang.chat

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private val TAG = "MainActivity"
    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.btnLogOut -> {
                Log.d(TAG, "LOG OUT")
                onLogOut()
            }
            R.id.btnChangeInfo -> {
                Log.d(TAG, "ChangeInfo")
            }
        }
    }

    private fun onLogOut() {
        startActivity(Intent(this@MainActivity, LoginActivity::class.java))
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initToolbar()
        initControl()
        relativeLayout_nav.setPadding(0, getHeightStatusbar(), 0, 0)

        bottomnav.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.home_screen -> {
                    Toast.makeText(applicationContext, "Home Componnent", Toast.LENGTH_LONG).show()
                }
                R.id.chat_screen -> {
                    Toast.makeText(applicationContext, "Chat Componnent", Toast.LENGTH_LONG).show()
                }
                R.id.detail_screen -> {
                    Toast.makeText(applicationContext, "Detail Componnent", Toast.LENGTH_LONG).show()
                }
            }
            true
        }
    }

    private fun initControl() {
        btnChangeInfo.setOnClickListener(this)
        btnLogOut.setOnClickListener(this)
    }

    private fun initToolbar() {
        val toolbar_main: Toolbar = findViewById(R.id.toolbar_main)
        toolbar_main.setNavigationIcon(R.drawable.menu)
        toolbar_main.setNavigationOnClickListener {
            drawerLayout.openDrawer(Gravity.START)
        }
    }

    public fun getHeightStatusbar(): Int {
        var result = 0
        var resourceId = this@MainActivity.resources.getIdentifier("status_bar_height", "dimen", "android")
        if (resourceId > 0) {
            result = this@MainActivity.resources.getDimensionPixelSize(resourceId)
        }
        return result
    }
}
