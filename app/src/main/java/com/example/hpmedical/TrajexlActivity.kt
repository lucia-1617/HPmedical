package com.example.hpmedical

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TrajexlActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_trajexl)
        val btn_tl = findViewById<AppCompatButton>(R.id.btn_tl)
        btn_tl.setOnClickListener {navegationToTallal()}

        val btn_txxl = findViewById<AppCompatButton>(R.id.btn_txxl)
        btn_txxl.setOnClickListener {navegationToTallaxxl()}
    }

    fun navegationToTallal(){
        val intent14 = Intent(this, TrajeActivity ::class.java)
        startActivity(intent14)
    }

    fun navegationToTallaxxl(){
        val intent13 = Intent(this, TrajexxlActivity ::class.java)
        startActivity(intent13)
    }
}