package com.example.hpmedical

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CatalogoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_catalogo)

            val btn_mobiliario = findViewById<AppCompatButton>(R.id.btn_mobiliario)
            btn_mobiliario.setOnClickListener {navegationToMobiliario()}

            val img_mobiliario = findViewById<ImageView>(R.id.img_mob)
            img_mobiliario.setOnClickListener {navegationToMobiliario()}

            val img_bloque = findViewById<ImageView>(R.id.img_bloq)
            img_bloque.setOnClickListener {navegationToBloque()}

            val btn_bloque = findViewById<AppCompatButton>(R.id.btn_bloque)
            btn_bloque.setOnClickListener {navegationToBloque()}

            val btn_cuidados = findViewById<AppCompatButton>(R.id.btn_cuidados)
            btn_cuidados.setOnClickListener{navegationToCuidados()}

            val img_cuidados = findViewById<ImageView>(R.id.img_cui)
            img_cuidados.setOnClickListener{navegationToCuidados()}

            val btn_rehabilitacion = findViewById<AppCompatButton>(R.id.btn_rehabilitacion)
            btn_rehabilitacion.setOnClickListener{navegationToRehabilitacion()}

            val img_rehabilitacion = findViewById<ImageView>(R.id.img_reha)
            img_rehabilitacion.setOnClickListener{navegationToRehabilitacion()}


        }


    fun navegationToMobiliario(){
        val intent2 = Intent(this, MobiliarioActivity::class.java)
        startActivity(intent2)
    }

    fun navegationToBloque(){
        val intent3 = Intent(this, BloqueActivity::class.java)
        startActivity(intent3)
    }

    fun navegationToCuidados(){
        val intent4 = Intent(this, CuidadosActivity::class.java)
        startActivity(intent4)
    }

    fun navegationToRehabilitacion(){
        val intent5 = Intent(this, RehabilitacionActivity::class.java)
        startActivity(intent5)
    }
}