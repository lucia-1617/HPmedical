package com.example.hpmedical

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EstetoscopioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_estetoscopio)
        val btn_verde = findViewById<AppCompatButton>(R.id.btn_verde)
        btn_verde.setOnClickListener {navegationToVerde()}
    }

    fun navegationToVerde(){
        val intent24 = Intent(this, EstetoscopioVerActivity ::class.java)
        startActivity(intent24)
    }
}