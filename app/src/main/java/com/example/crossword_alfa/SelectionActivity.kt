package com.example.crossword_alfa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlin.system.exitProcess

class SelectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selection)

    }
    fun playBut(view: View){
        val intent: Intent = Intent(this@SelectionActivity, DifficultySelection::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        when(view.id){
            R.id.Play -> startActivity(intent)
        }
        val select = Toast.makeText(this, "Удачной игры!", Toast.LENGTH_SHORT)
        select.show()
    }
    fun exitBut(view: View) {
        val exitBut: Button = findViewById<Button>(R.id.Exit) as Button
        exitBut.setOnClickListener {
            finish()
        }
    }
    fun infoImgBut(view: View){
        val info = Toast.makeText(this, "Создатель: Филипьев Константин", Toast.LENGTH_SHORT)
        info.show()
    }



}