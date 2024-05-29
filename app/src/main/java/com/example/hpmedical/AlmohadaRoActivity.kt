package com.example.hpmedical

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AlmohadaRoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_almohada_ro)

        val btn_azul = findViewById<AppCompatButton>(R.id.btn_azul)
        btn_azul.setOnClickListener {navegationToAzul()}
    }

    fun navegationToAzul(){
        val intent8 = Intent(this, AlmohadaActivity ::class.java)
        startActivity(intent8)
    }
}