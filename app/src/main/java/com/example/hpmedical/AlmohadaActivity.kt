package com.example.hpmedical

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AlmohadaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_almohada)

        val btn_rosado = findViewById<AppCompatButton>(R.id.btn_rosado)
        btn_rosado.setOnClickListener {navegationToRosado()}

        val btn_back = findViewById<ImageButton>(R.id.btn_back)
        btn_back.setOnClickListener {navegationToInicio()}
    }

    fun navegationToRosado(){
        val intent7 = Intent(this, AlmohadaRoActivity ::class.java)
        startActivity(intent7)
    }

    fun navegationToInicio(){
        val intent = Intent(this, MainActivity ::class.java)
        startActivity(intent)
    }

}