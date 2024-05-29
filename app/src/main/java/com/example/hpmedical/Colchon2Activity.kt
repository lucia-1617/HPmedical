package com.example.hpmedical

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Colchon2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_colchon2)
        val btn_domus1 = findViewById<AppCompatButton>(R.id.btn_domus1)
        btn_domus1.setOnClickListener {navegationToDomus1()}
    }

    fun navegationToDomus1(){
        val intent11 = Intent(this, ColchonActivity ::class.java)
        startActivity(intent11)
    }
}