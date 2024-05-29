package com.example.hpmedical

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Solucion3LActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_solucion3_lactivity)
        val btn_1l = findViewById<AppCompatButton>(R.id.btn_1l)
        btn_1l.setOnClickListener {navegationTo1L()}

        val btn_5l = findViewById<AppCompatButton>(R.id.btn_5l)
        btn_5l.setOnClickListener {navegationTo5l()}
    }

    fun navegationTo1L(){
        val intent19 = Intent(this, SolucionActivity ::class.java)
        startActivity(intent19)
    }

    fun navegationTo5l(){
        val intent18 = Intent(this, Solucion5LActivity ::class.java)
        startActivity(intent18)
    }
}