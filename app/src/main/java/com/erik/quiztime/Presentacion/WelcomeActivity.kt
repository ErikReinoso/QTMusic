package com.erik.quiztime.Presentacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.erik.quiztime.R

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        var btnIniciar = findViewById<Button>(R.id.btnIniciar)
        var title = findViewById<TextView>(R.id.title)

        btnIniciar.setOnClickListener(){
            var intent = Intent(this, CategoriasActivity::class.java)
            startActivity(intent)
        }

    }
}