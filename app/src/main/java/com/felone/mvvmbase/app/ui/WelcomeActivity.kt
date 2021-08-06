package com.felone.mvvmbase.app.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.felone.mvvmbase.R

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
    }
}