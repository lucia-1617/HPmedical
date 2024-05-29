package com.example.hpmedical

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ColchonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_colchon)

        val btn_domus2 = findViewById<AppCompatButton>(R.id.btn_domus2)
        btn_domus2.setOnClickListener {navegationToDomus2()}
    }

    fun navegationToDomus2(){
        val intent10 = Intent(this, Colchon2Activity ::class.java)
        startActivity(intent10)
    }
}