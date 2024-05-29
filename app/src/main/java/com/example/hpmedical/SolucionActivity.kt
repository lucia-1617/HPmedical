package com.example.hpmedical

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SolucionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_solucion)
        val btn_3l = findViewById<AppCompatButton>(R.id.btn_3l)
        btn_3l.setOnClickListener {navegationTo3L()}

        val btn_5l = findViewById<AppCompatButton>(R.id.btn_5l)
        btn_5l.setOnClickListener {navegationTo5l()}
    }

    fun navegationTo3L(){
        val intent17 = Intent(this, Solucion3LActivity ::class.java)
        startActivity(intent17)
    }

    fun navegationTo5l(){
        val intent18 = Intent(this, Solucion5LActivity ::class.java)
        startActivity(intent18)
    }
}