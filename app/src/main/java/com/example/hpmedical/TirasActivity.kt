package com.example.hpmedical

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TirasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tiras)
        val btn_t50 = findViewById<AppCompatButton>(R.id.btn_t50)
        btn_t50.setOnClickListener {navegationToTiras50()}
    }

    fun navegationToTiras50(){
        val intent22 = Intent(this, Tiras50Activity ::class.java)
        startActivity(intent22)
    }
}