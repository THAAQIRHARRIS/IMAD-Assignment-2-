package com.example.assignment2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val  btnClick = findViewById<Button>(R.id.btnClick)
        val txtHead = findViewById<TextView>(R.id.txtHead)
        val txtWell = findViewById<TextView>(R.id.txtWell)


        txtHead.text = "Tamagotchi app"
        txtWell.text = "Welcome to"
        // code to change the text when you start running the app


        btnClick?.setOnClickListener {
         val intent = Intent(this,Dogsgame::class.java)
            startActivity(intent)
            // linking main activity to the activity dogsgame
        }

    }



}