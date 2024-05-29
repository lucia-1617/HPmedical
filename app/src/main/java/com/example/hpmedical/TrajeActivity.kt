package com.example.hpmedical

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TrajeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_traje)
        val btn_txl = findViewById<AppCompatButton>(R.id.btn_txl)
        btn_txl.setOnClickListener {navegationToTallaxl()}

        val btn_txxl = findViewById<AppCompatButton>(R.id.btn_txxl)
        btn_txxl.setOnClickListener {navegationToTallaxxl()}
    }

    fun navegationToTallaxl(){
        val intent12 = Intent(this, TrajexlActivity ::class.java)
        startActivity(intent12)
    }

    fun navegationToTallaxxl(){
        val intent13 = Intent(this, TrajexxlActivity ::class.java)
        startActivity(intent13)
    }
}