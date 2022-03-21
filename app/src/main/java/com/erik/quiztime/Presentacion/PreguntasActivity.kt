package com.erik.quiztime.Presentacion

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.erik.quiztime.R


class PreguntasActivity : AppCompatActivity() {
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