package com.example.androidtestingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {

    private lateinit var backToMainActivityButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        this.backToMainActivityButton = findViewById(R.id.back_to_main_activity_btn)

        this.backToMainActivityButton.setOnClickListener {
            finish()
        }
    }
}