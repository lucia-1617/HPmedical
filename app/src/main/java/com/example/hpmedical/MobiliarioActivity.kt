package com.example.hpmedical

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MobiliarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_mobiliario)
        val btn_almohada = findViewById<AppCompatButton>(R.id.btn_almohada)
        btn_almohada.setOnClickListener {navegationToAlmohada()}

        val btn_colchon = findViewById<AppCompatButton>(R.id.btn_colchon)
        btn_colchon.setOnClickListener {navegationToColchon()}
    }

    fun navegationToAlmohada(){
        val intent6 = Intent(this, AlmohadaActivity ::class.java)
        startActivity(intent6)
    }

    fun navegationToColchon(){
        val intent9 = Intent(this, ColchonActivity::class.java)
        startActivity(intent9)
    }
}