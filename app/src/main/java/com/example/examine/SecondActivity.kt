package com.example.examine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
    fun changeToNextActivity(view: View) {
        val intentToCallNextActivity = Intent(this, SecondActivity::class.java)
        startActivity(intentToCallNextActivity)
    }
}