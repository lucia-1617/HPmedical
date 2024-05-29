package com.example.hpmedical

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Tiras50Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tiras50)
        val btn_t25 = findViewById<AppCompatButton>(R.id.btn_t25)
        btn_t25.setOnClickListener {navegationToTiras25()}
    }

    fun navegationToTiras25(){
        val intent23 = Intent(this, TirasActivity ::class.java)
        startActivity(intent23)
    }
}