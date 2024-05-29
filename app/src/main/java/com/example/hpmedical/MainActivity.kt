package com.example.hpmedical

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btn_categoria = findViewById<AppCompatButton>(R.id.btn_categoria)
        btn_categoria.setOnClickListener {navegationToCategoria()}
        val btn_productos = findViewById<AppCompatButton>(R.id.btn_productos)
        btn_productos.setOnClickListener {navegationToProductos()}

        }

    fun navegationToCategoria(){
        val intent = Intent(this, CatalogoActivity::class.java)
        startActivity(intent)
    }



    fun navegationToProductos(){
        val intent1 = Intent(this, ProductosActivity::class.java)
        startActivity(intent1)
    }
}