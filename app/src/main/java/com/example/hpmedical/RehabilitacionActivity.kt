package com.example.hpmedical

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RehabilitacionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_rehabilitacion)
        val btn_andador = findViewById<AppCompatButton>(R.id.btn_andador)
        btn_andador.setOnClickListener {navegationToAndador()}

        val img_andador = findViewById<ImageView>(R.id.img_anda)
        img_andador.setOnClickListener {navegationToAndador()}

        val btn_ferula = findViewById<AppCompatButton>(R.id.btn_ferula)
        btn_ferula.setOnClickListener {navegationToFerula()}

        val img_ferula = findViewById<ImageView>(R.id.img_feru)
        img_ferula.setOnClickListener {navegationToFerula()}
    }

    fun navegationToAndador(){
        val intent26 = Intent(this, AndadorActivity ::class.java)
        startActivity(intent26)
    }

    fun navegationToFerula(){
        val intent27 = Intent(this, FerulaActivity ::class.java)
        startActivity(intent27)
    }
}