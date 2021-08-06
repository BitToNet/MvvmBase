package com.felone.mvvmbase.app.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cat.ereza.customactivityoncrash.CustomActivityOnCrash
import com.felone.mvvmbase.R
import kotlinx.android.synthetic.main.activity_error.*

class ErrorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_error)
        val config = CustomActivityOnCrash.getConfigFromIntent(intent)
        button2.setOnClickListener {
            config?.run {
                CustomActivityOnCrash.restartApplication(this@ErrorActivity, config)
            }

        }
    }
}