package com.example.hpmedical

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FerulaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ferula)
        val btn_grande = findViewById<AppCompatButton>(R.id.btn_grande)
        btn_grande.setOnClickListener {navegationToFerulaG()}
    }

    fun navegationToFerulaG(){
        val intent30 = Intent(this, FerulaGrandeActivity ::class.java)
        startActivity(intent30)
    }
}