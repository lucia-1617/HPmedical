package com.example.hpmedical

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BloqueActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bloque)

        val btn_traje = findViewById<AppCompatButton>(R.id.btn_traje)
        btn_traje.setOnClickListener {navegationToTraje()}

        val img_traje = findViewById<ImageView>(R.id.img_tra)
        img_traje.setOnClickListener {navegationToTraje()}

        val btn_solucion = findViewById<AppCompatButton>(R.id.btn_solucion)
        btn_solucion.setOnClickListener {navegationToSolucion()}

        val img_solucion = findViewById<ImageView>(R.id.img_sol)
        img_solucion.setOnClickListener {navegationToSolucion()}
    }

    fun navegationToTraje(){
        val intent14 = Intent(this, TrajeActivity ::class.java)
        startActivity(intent14)
    }

    fun navegationToSolucion(){
        val intent15 = Intent(this, SolucionActivity ::class.java)
        startActivity(intent15)
    }
}