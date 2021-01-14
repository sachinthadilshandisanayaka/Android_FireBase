package com.dissanayake.firebasedemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        findViewById<Button>(R.id.button).setOnClickListener {
            val navToRegisterActivity = Intent(this, RegisterActivity::class.java)
            startActivity(navToRegisterActivity)
        }

        findViewById<Button>(R.id.button2).setOnClickListener {
            val navToLoginActivity = Intent(this, LoginActivity::class.java)
            startActivity(navToLoginActivity)
        }
    }
}