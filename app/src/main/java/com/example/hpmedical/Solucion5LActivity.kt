package com.example.hpmedical

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Solucion5LActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_solucion5_lactivity)
        val btn_1l = findViewById<AppCompatButton>(R.id.btn_1l)
        btn_1l.setOnClickListener {navegationTo1L()}

        val btn_3l = findViewById<AppCompatButton>(R.id.btn_3l)
        btn_3l.setOnClickListener {navegationTo3l()}

        val btn_back = findViewById<ImageButton>(R.id.btn_back)
        btn_back.setOnClickListener {navegationToInicio()}
    }

    fun navegationTo1L(){
        val intent19 = Intent(this, SolucionActivity ::class.java)
        startActivity(intent19)
    }

    fun navegationTo3l(){
        val intent17 = Intent(this, Solucion3LActivity ::class.java)
        startActivity(intent17)
    }

    fun navegationToInicio(){
        val intent = Intent(this, MainActivity ::class.java)
        startActivity(intent)
    }
}