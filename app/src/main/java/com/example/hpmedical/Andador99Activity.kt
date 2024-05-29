package com.example.hpmedical

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Andador99Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_andador99)
        val btn_97 = findViewById<AppCompatButton>(R.id.btn_97)
        btn_97.setOnClickListener {navegationToAndador97()}
    }

    fun navegationToAndador97(){
    val intent29 = Intent(this, AndadorActivity ::class.java)
    startActivity(intent29)
    }
    }