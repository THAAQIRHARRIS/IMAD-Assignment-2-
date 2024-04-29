package com.example.assignment2

import Dogsgame.kt.petgame
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.ImageView
import android.widget.VideoView





class Dogsgame : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dogsgame)
        val imgChange = findViewById<ImageView>(R.id.imageView)
        val btnClean = findViewById<Button>(R.id.btnClean)
        val btnFeed = findViewById<Button>(R.id.btnFeed)
        val btnPlay = findViewById<Button>(R.id.btnPlay)
        val txtFeed = findViewById<TextView>(R.id.txtFeed)
        val txtTime = findViewById<TextView>(R.id.txtTime)
        val btnResult = findViewById<Button>(R.id.btnResult)
        val txtCook = findViewById<TextView>(R.id.txtCook)
        val txtPlay = findViewById<TextView>(R.id.txtPlay)


        var c1 = petgame.petgame(
            "Pet is eating food",
            "Pet is fully feed!",
            "Pet is fresh and clean.",
            "Pet is super clean!",
            "Pet is having fun and playing around.",
            "Pet is tired from playing alot!",
            "YOU WIN !!!",
            "YOU LOSE, YOUR HAS FAINTED"
        )

        txtFeed.text = " click buttons to feed, Play and clean pet then" +
                " click result button"
        // code to change the text when you start running the app

        imgChange.setImageResource(R.drawable.eevee)
        // set a default image when on the activity
        var intNum : Int = 10
        var strNum : String = "0"

        btnFeed?.setOnClickListener {
                txtFeed.text = "Pet is eating food"
                imgChange.setImageResource(R.drawable.pokemoneating)
            intNum = intNum - 1
            txtCook.text = intNum.toString()
            if (intNum  == 0 ) {
                btnFeed.isEnabled = false

                    txtFeed.text = "Pet is fully feed!"
            }
            // feeding your pet and disables the button aswell
        }
        var intClean : Int = 10
        btnClean.setOnClickListener {
            txtFeed.text = "Pet is fresh and clean. "
            imgChange.setImageResource(R.drawable.pokemoncleanig)
            intClean = intClean -1
            txtTime.text = intClean.toString()
            if (intClean == 0) {
                btnClean.isEnabled = false
                txtFeed.text = "Pet is super clean!"

            }

            // cleaning your pet and disables the button
        }
        var intPlay : Int = 10
        btnPlay.setOnClickListener {
            txtFeed.text = "Pet is having fun and playing around."
            imgChange.setImageResource(R.drawable.sleepie)
            intPlay = intPlay -1
            txtPlay.text = intPlay.toString()
            if (intPlay == 0) {
                btnPlay.isEnabled = false
                txtFeed.text = "Pet is tired from playing alot!"
            }
            // playing with pet and disaables the button
        }

        btnResult.setOnClickListener {
            if (txtCook.text.toString().toInt() == 0 && txtTime.text.toString().toInt() == 0 && txtPlay.text.toString().toInt() == 0){
                txtFeed.text = "YOU WIN !!!"
                imgChange.setImageResource(R.drawable.trophy) // this result well show if complete tasks in the app(game) correctly
            }else{
                txtFeed.text = "YOU LOSE, YOUR HAS FAINTED"
                imgChange.setImageResource(R.drawable.fainted) // this result will show
            }



        }
    }



}
