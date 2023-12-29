package com.example.newproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class Splashscreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashscreen)
        val splashScreenDuration = 2000
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, Loginpage::class.java))
            finish()
        }, splashScreenDuration.toLong())
    }
}