package com.aswani.tictactoeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    private lateinit var a1: Button
    private lateinit var a2: Button
    private lateinit var a3: Button

    private lateinit var b1: Button
    private lateinit var b2: Button
    private lateinit var b3: Button

    private lateinit var c1: Button
    private lateinit var c2: Button
    private lateinit var c3: Button

    private lateinit var tvTurn: TextView
    private lateinit var restart: ImageButton
    private lateinit var game: ConstraintLayout

    private var currentTurn: Int = 0
    private var play: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initComponents()
        listeners()
        ui()

    }

    private fun initComponents() {
        a1 = findViewById(R.id.a1)
        a2 = findViewById(R.id.a2)
        a3 = findViewById(R.id.a3)
        b1 = findViewById(R.id.b1)
        b2 = findViewById(R.id.b2)
        b3 = findViewById(R.id.b3)
        c1 = findViewById(R.id.c1)
        c2 = findViewById(R.id.c2)
        c3 = findViewById(R.id.c3)

        tvTurn = findViewById(R.id.tvTurn)
        restart = findViewById(R.id.restart)
        game = findViewById(R.id.game)

    }

    private fun listeners() {
        a1.setOnClickListener {
            if (a1.text == "" && play) {
                if (currentTurn % 2 == 0) {
                    a1.text = "X"
                    currentTurn++
                    ui()
                } else {
                    a1.text = "O"
                    currentTurn++
                    ui()
                }
            }
        }

        a2.setOnClickListener {
            if (a2.text == "" && play) {
                if (currentTurn % 2 == 0) {
                    a2.text = "X"
                    currentTurn++
                    ui()
                } else {
                    a2.text = "O"
                    currentTurn++
                    ui()
                }
            }
        }

        a3.setOnClickListener {
            if (a3.text == "" && play) {
                if (currentTurn % 2 == 0) {
                    a3.text = "X"
                    currentTurn++
                    ui()
                } else {
                    a3.text = "O"
                    currentTurn++
                    ui()
                }
            }
        }

        b1.setOnClickListener {
            if (b1.text == "" && play) {
                if (currentTurn % 2 == 0) {
                    b1.text = "X"
                    currentTurn++
                    ui()
                } else {
                    b1.text = "O"
                    currentTurn++
                    ui()
                }
            }
        }

        b2.setOnClickListener {
            if (b2.text == "" && play) {
                if (currentTurn % 2 == 0) {
                    b2.text = "X"
                    currentTurn++
                    ui()
                } else {
                    b2.text = "O"
                    currentTurn++
                    ui()
                }
            }
        }

        b3.setOnClickListener {
            if (b3.text == "" && play) {
                if (currentTurn % 2 == 0) {
                    b3.text = "X"
                    currentTurn++
                    ui()
                } else {
                    b3.text = "O"
                    currentTurn++
                    ui()
                }
            }
        }

        c1.setOnClickListener {
            if (c1.text == "" && play) {
                if (currentTurn % 2 == 0) {
                    c1.text = "X"
                    currentTurn++
                    ui()
                } else {
                    c1.text = "O"
                    currentTurn++
                    ui()
                }
            }
        }

        c2.setOnClickListener {
            if (c2.text == "" && play) {
                if (currentTurn % 2 == 0) {
                    c2.text = "X"
                    currentTurn++
                    ui()
                } else {
                    c2.text = "O"
                    currentTurn++
                    ui()
                }
            }
        }

        c3.setOnClickListener {
            if (c3.text == "" && play) {
                if (currentTurn % 2 == 0) {
                    c3.text = "X"
                    currentTurn++
                    ui()
                } else {
                    c3.text = "O"
                    currentTurn++
                    ui()
                }
            }
        }

        restart.setOnClickListener {
            a1.text = ""
            a1.setBackgroundColor(ContextCompat.getColor(this, R.color.Blue))
            a2.text = ""
            a2.setBackgroundColor(ContextCompat.getColor(this, R.color.Blue))
            a3.text = ""
            a3.setBackgroundColor(ContextCompat.getColor(this, R.color.Blue))
            b1.text = ""
            b1.setBackgroundColor(ContextCompat.getColor(this, R.color.Blue))
            b2.text = ""
            b2.setBackgroundColor(ContextCompat.getColor(this, R.color.Blue))
            b3.text = ""
            b3.setBackgroundColor(ContextCompat.getColor(this, R.color.Blue))
            c1.text = ""
            c1.setBackgroundColor(ContextCompat.getColor(this, R.color.Blue))
            c2.text = ""
            c2.setBackgroundColor(ContextCompat.getColor(this, R.color.Blue))
            c3.text = ""
            c3.setBackgroundColor(ContextCompat.getColor(this, R.color.Blue))
            window.statusBarColor = getColor(R.color.Blue)
            currentTurn = 0
            play = true
            ui()

        }
    }

    private fun ui(){
        if(currentTurn%2 == 0){
            tvTurn.text = "X"
        }else{tvTurn.text = "O"}

        if((a1.text == a2.text && a2.text == a3.text) && a1.text != ""){
            a1.setBackgroundColor(ContextCompat.getColor(this, R.color.btn_blue))
            a2.setBackgroundColor(ContextCompat.getColor(this, R.color.btn_blue))
            a3.setBackgroundColor(ContextCompat.getColor(this, R.color.btn_blue))
            play = false
        }

        if((b1.text == b2.text && b2.text == b3.text) && b1.text != ""){
            b1.setBackgroundColor(ContextCompat.getColor(this, R.color.btn_blue))
            b2.setBackgroundColor(ContextCompat.getColor(this, R.color.btn_blue))
            b3.setBackgroundColor(ContextCompat.getColor(this, R.color.btn_blue))
            play = false
        }

        if((c1.text == c2.text && c2.text == c3.text) && c1.text != ""){
            c1.setBackgroundColor(ContextCompat.getColor(this, R.color.btn_blue))
            c2.setBackgroundColor(ContextCompat.getColor(this, R.color.btn_blue))
            c3.setBackgroundColor(ContextCompat.getColor(this, R.color.btn_blue))
            play = false
        }

        if((a1.text == b1.text && b1.text == c1.text) && a1.text != ""){
            a1.setBackgroundColor(ContextCompat.getColor(this, R.color.Grey))
            b1.setBackgroundColor(ContextCompat.getColor(this, R.color.Grey))
            c1.setBackgroundColor(ContextCompat.getColor(this, R.color.Grey))
            play = false
        }

        if((a2.text == b2.text && b2.text == c2.text) && a2.text != ""){
            a2.setBackgroundColor(ContextCompat.getColor(this, R.color.Grey))
            b2.setBackgroundColor(ContextCompat.getColor(this, R.color.Grey))
            c2.setBackgroundColor(ContextCompat.getColor(this, R.color.Grey))
            play = false
        }

        if((a3.text == b3.text && b3.text == c3.text) && a3.text != ""){
            a3.setBackgroundColor(ContextCompat.getColor(this, R.color.Grey))
            b3.setBackgroundColor(ContextCompat.getColor(this, R.color.Grey))
            c3.setBackgroundColor(ContextCompat.getColor(this, R.color.Grey))
            play = false
        }

        if((a1.text == b2.text && b2.text == c3.text) && a1.text != ""){
            a1.setBackgroundColor(ContextCompat.getColor(this, R.color.Silver))
            b2.setBackgroundColor(ContextCompat.getColor(this, R.color.Silver))
            c3.setBackgroundColor(ContextCompat.getColor(this, R.color.Silver))
            play = false
        }

        if((a3.text == b2.text && b2.text == c1.text) && a3.text != ""){
            a3.setBackgroundColor(ContextCompat.getColor(this, R.color.Silver))
            b2.setBackgroundColor(ContextCompat.getColor(this, R.color.Silver))
            c1.setBackgroundColor(ContextCompat.getColor(this, R.color.Silver))
            play = false
        }

        if(currentTurn == 9 && play){
            a1.setBackgroundColor(ContextCompat.getColor(this, R.color.btn_lightPurple))
            a2.setBackgroundColor(ContextCompat.getColor(this, R.color.btn_lightPurple))
            a3.setBackgroundColor(ContextCompat.getColor(this, R.color.btn_lightPurple))
            b1.setBackgroundColor(ContextCompat.getColor(this, R.color.btn_lightPurple))
            b2.setBackgroundColor(ContextCompat.getColor(this, R.color.btn_lightPurple))
            b3.setBackgroundColor(ContextCompat.getColor(this, R.color.btn_lightPurple))
            c1.setBackgroundColor(ContextCompat.getColor(this, R.color.btn_lightPurple))
            c2.setBackgroundColor(ContextCompat.getColor(this, R.color.btn_lightPurple))
            c3.setBackgroundColor(ContextCompat.getColor(this, R.color.btn_lightPurple))
        }

    }
}


