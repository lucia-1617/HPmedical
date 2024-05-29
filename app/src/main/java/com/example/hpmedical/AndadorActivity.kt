package com.example.hpmedical

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AndadorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_andador)
        val btn_99 = findViewById<AppCompatButton>(R.id.btn_99)
        btn_99.setOnClickListener {navegationToAndador99()}
    }

    fun navegationToAndador99(){
        val intent28 = Intent(this, Andador99Activity ::class.java)
        startActivity(intent28)
    }
}