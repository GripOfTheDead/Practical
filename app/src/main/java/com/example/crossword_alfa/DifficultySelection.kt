package com.example.crossword_alfa

import android.content.Intent
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.FragmentContainer
import androidx.fragment.app.FragmentContainerView

class DifficultySelection : AppCompatActivity() {
    lateinit var fragmentEasy : FragmentContainerView
    lateinit var fragmentDifficult : FragmentContainerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_difficulty_selection)
        fragmentEasy = findViewById<FragmentContainerView>(R.id.fragmentContainerViewEasy)
        fragmentDifficult = findViewById<FragmentContainerView>(R.id.fragmentContainerViewDifficult)
    }
    fun easilyInfoBut(view: View){
        when(view.id){
            R.id.easily -> {
                if(fragmentEasy.visibility == View.INVISIBLE){
                    fragmentEasy.visibility = View.VISIBLE
                    fragmentDifficult.visibility = View.INVISIBLE
                }
                else fragmentEasy.visibility = View.INVISIBLE
            }
        }
    }
    fun difficultInfoBut(view: View){
        when(view.id){
            R.id.difficult -> {

                if(fragmentDifficult.visibility == View.INVISIBLE){
                    fragmentEasy.visibility = View.INVISIBLE
                    fragmentDifficult.visibility = View.VISIBLE
                }
                else fragmentDifficult.visibility = View.INVISIBLE
            }
        }
    }
    fun imageButBack(view: View){
        val intent: Intent = Intent(this@DifficultySelection,SelectionActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        when(view.id){
            R.id.imgButBack -> startActivity(intent)
        }
    }
    fun btnPlayDifficultGame(view: View){
        val intent: Intent = Intent(this@DifficultySelection,DifficultyGame::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        when(view.id){
            R.id.butDifGame -> startActivity(intent)
        }
    }
    fun btnPlayEasilyGame(view: View){
        val intent: Intent = Intent(this@DifficultySelection,EasilyGame::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        when(view.id){
            R.id.butEasilyGame -> startActivity(intent)
        }
        val info = Toast.makeText(this, "Ответ должен быть с Заглавной буквы", Toast.LENGTH_LONG)
        info.show()
    }
}