package com.example.hpmedical

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TrajexxlActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_trajexxl)
        val btn_tl = findViewById<AppCompatButton>(R.id.btn_tl)
        btn_tl.setOnClickListener {navegationToTallal()}

        val btn_txl = findViewById<AppCompatButton>(R.id.btn_txl)
        btn_txl.setOnClickListener {navegationToTallaxl()}

        val btn_back = findViewById<ImageButton>(R.id.btn_back)
        btn_back.setOnClickListener {navegationToInicio()}
    }

    fun navegationToTallal(){
        val intent14 = Intent(this, TrajeActivity ::class.java)
        startActivity(intent14)
    }

    fun navegationToTallaxl(){
        val intent12 = Intent(this, TrajexlActivity ::class.java)
        startActivity(intent12)
    }

    fun navegationToInicio(){
        val intent = Intent(this, MainActivity ::class.java)
        startActivity(intent)
    }
}