package com.example.hpmedical

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EstetoscopioVerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_estetoscopio_ver)
        val btn_negro = findViewById<AppCompatButton>(R.id.btn_negro)
        btn_negro.setOnClickListener {navegationToNegro()}
    }

    fun navegationToNegro(){
        val intent25 = Intent(this, EstetoscopioActivity ::class.java)
        startActivity(intent25)
    }
}