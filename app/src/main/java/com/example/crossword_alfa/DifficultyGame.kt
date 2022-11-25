package com.example.crossword_alfa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class DifficultyGame : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_difficulty_game)

    }
    fun backToSel(view: View){
        val intent: Intent = Intent(this@DifficultyGame, DifficultySelection::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        when(view.id){
            R.id.butDifGame -> startActivity(intent)
        }
    }
}