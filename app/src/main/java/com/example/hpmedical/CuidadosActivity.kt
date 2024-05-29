package com.example.hpmedical

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CuidadosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cuidados)
        val btn_tiras = findViewById<AppCompatButton>(R.id.btn_tiras)
        btn_tiras.setOnClickListener {navegationToTiras()}

        val btn_estetoscopio = findViewById<AppCompatButton>(R.id.btn_estetoscopio)
        btn_estetoscopio.setOnClickListener {navegationToEstetoscopio()}
    }

    fun navegationToTiras(){
        val intent20 = Intent(this, TirasActivity ::class.java)
        startActivity(intent20)
    }

    fun navegationToEstetoscopio(){
        val intent21 = Intent(this, EstetoscopioActivity::class.java)
        startActivity(intent21)
    }
}