package com.example.hpmedical

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FerulaGrandeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ferula_grande)
        val btn_pequeno = findViewById<AppCompatButton>(R.id.btn_pequeno)
        btn_pequeno.setOnClickListener {navegationToFerulaP()}
    }

    fun navegationToFerulaP(){
        val intent31 = Intent(this, FerulaActivity ::class.java)
        startActivity(intent31)
    }
}