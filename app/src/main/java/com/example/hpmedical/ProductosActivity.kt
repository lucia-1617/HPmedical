package com.example.hpmedical

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProductosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_productos)
        val btn_almohada = findViewById<AppCompatButton>(R.id.btn_almohada)
        btn_almohada.setOnClickListener {navegationToAlmohada()}
        val btn_colchon = findViewById<AppCompatButton>(R.id.btn_colchon)
        btn_colchon.setOnClickListener {navegationToColchon()}
        val btn_traje = findViewById<AppCompatButton>(R.id.btn_traje)
        btn_traje.setOnClickListener {navegationToTraje()}
        val btn_solucion = findViewById<AppCompatButton>(R.id.btn_solucion)
        btn_solucion.setOnClickListener {navegationToSolucion()}
        val btn_tiras = findViewById<AppCompatButton>(R.id.btn_tiras)
        btn_tiras.setOnClickListener {navegationToTiras()}
        val btn_estetoscopio = findViewById<AppCompatButton>(R.id.btn_estetoscopio)
        btn_estetoscopio.setOnClickListener {navegationToEstetoscopio()}
        val btn_andador = findViewById<AppCompatButton>(R.id.btn_andador)
        btn_andador.setOnClickListener {navegationToAndador()}
        val btn_ferula = findViewById<AppCompatButton>(R.id.btn_ferula)
        btn_ferula.setOnClickListener {navegationToFerula()}
    }

        fun navegationToAlmohada(){
        val intent32 = Intent(this, AlmohadaActivity ::class.java)
        startActivity(intent32)
    }

        fun navegationToColchon(){
        val intent33 = Intent(this, ColchonActivity ::class.java)
        startActivity(intent33)
    }

        fun navegationToTraje(){
        val intent34 = Intent(this, TrajeActivity ::class.java)
        startActivity(intent34)
    }

        fun navegationToSolucion(){
        val intent35 = Intent(this, SolucionActivity ::class.java)
        startActivity(intent35)
    }

        fun navegationToTiras(){
        val intent36 = Intent(this, TirasActivity ::class.java)
        startActivity(intent36)
    }

        fun navegationToEstetoscopio(){
        val intent37 = Intent(this, EstetoscopioActivity ::class.java)
        startActivity(intent37)
    }

        fun navegationToAndador(){
        val intent38 = Intent(this, AndadorActivity ::class.java)
        startActivity(intent38)
    }

        fun navegationToFerula(){
        val intent39 = Intent(this, FerulaActivity ::class.java)
        startActivity(intent39) 
    }
}