package com.example.crossword_alfa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class EasilyGame : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_easily_game)
        val buttonRespond = findViewById<Button>(R.id.buttonRespond)

        buttonRespond.setOnClickListener {
            val textViewRespondOne = findViewById<TextView>(R.id.textViewRespondOne)
            val textTextRespondTwo = findViewById<TextView>(R.id.textTextRespondTwo)
            val textViewRespondTree = findViewById<TextView>(R.id.textViewRespondTree)
            val textViewRespondFour = findViewById<TextView>(R.id.textViewRespondFour)
            val textViewRespondFive = findViewById<TextView>(R.id.textViewRespondFive)
            val editTextRespond = findViewById<EditText>(R.id.editTextRespond)
            val selectTextView = findViewById<TextView>(R.id.selectTextView)

            when(editTextRespond.text.toString()){
                "Яблоко" -> {
                    textViewRespondOne.visibility = View.VISIBLE
                    val info = Toast.makeText(this, "Верно!", Toast.LENGTH_SHORT)
                    info.show()
                    editTextRespond.text = null
                }
                "Яблоко " -> {
                    textViewRespondOne.visibility = View.VISIBLE
                    val info = Toast.makeText(this, "Верно!", Toast.LENGTH_SHORT)
                    info.show()
                    editTextRespond.text = null
                }
                "Колизей" -> {
                    textTextRespondTwo.visibility = View.VISIBLE
                    val info = Toast.makeText(this, "Правильно!", Toast.LENGTH_SHORT)
                    info.show()
                    editTextRespond.text = null
                }
                "Колизей " -> {
                    textTextRespondTwo.visibility = View.VISIBLE
                    val info = Toast.makeText(this, "Правильно!", Toast.LENGTH_SHORT)
                    info.show()
                    editTextRespond.text = null
                }
                "Мёд"  -> {
                    textViewRespondTree.visibility = View.VISIBLE
                    val info = Toast.makeText(this, "Великолепно!", Toast.LENGTH_SHORT)
                    info.show()
                    editTextRespond.text = null
                }
                "Мёд "  -> {
                    textViewRespondTree.visibility = View.VISIBLE
                    val info = Toast.makeText(this, "Великолепно!", Toast.LENGTH_SHORT)
                    info.show()
                    editTextRespond.text = null
                }

                "Дракон" -> {
                    textViewRespondFour.visibility = View.VISIBLE
                    val info = Toast.makeText(this, "Абсолютно верно!", Toast.LENGTH_SHORT)
                    info.show()
                    editTextRespond.text = null
                }
                "Дракон " -> {
                textViewRespondFour.visibility = View.VISIBLE
                val info = Toast.makeText(this, "Абсолютно верно!", Toast.LENGTH_SHORT)
                info.show()
                editTextRespond.text = null
                }
                "Лаборатория" -> {
                    textViewRespondFive.visibility = View.VISIBLE
                    val info = Toast.makeText(this, "Отлично!", Toast.LENGTH_SHORT)
                    info.show()
                    editTextRespond.text = null
                }
                "Лаборатория " -> {
                    textViewRespondFive.visibility = View.VISIBLE
                    val info = Toast.makeText(this, "Отлично!", Toast.LENGTH_SHORT)
                    info.show()
                    editTextRespond.text = null
                }
                "Лодка" -> {
                    val info = Toast.makeText(this, "Поздравлям, вы прошли лёгкий уровень!", Toast.LENGTH_LONG)
                    info.show()
                    val intent: Intent = Intent(this@EasilyGame,VictoryActivity::class.java)
                    startActivity(intent)
                }
                "Лодка " -> {
                    val info = Toast.makeText(this, "Поздравлям, вы прошли лёгкий уровень!", Toast.LENGTH_LONG)
                    info.show()
                    val intent: Intent = Intent(this@EasilyGame,VictoryActivity::class.java)
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                    startActivity(intent)
                }
                else -> {
                    val info = Toast.makeText(this, "Не правильно", Toast.LENGTH_SHORT)
                    info.show()
                }
            }
            if (textViewRespondOne.visibility != View.INVISIBLE && textTextRespondTwo.visibility != View.INVISIBLE &&
                textViewRespondTree.visibility != View.INVISIBLE && textViewRespondFour.visibility != View.INVISIBLE && textViewRespondFive.visibility != View.INVISIBLE){
                val info = Toast.makeText(this, "Впишите получившееся слово по вертикали", Toast.LENGTH_LONG)
                info.show()
            }
        }
    }
    fun surrenderBut(view: View){
        val intent: Intent = Intent(this@EasilyGame,DifficultySelection::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(intent)
    }
    fun onClickRadioButton(view:View){
        when(view.id){
            R.id.oneQues -> {
                val selectedTextView = findViewById<TextView>(R.id.selectTextView)
                selectedTextView.text = getString(R.string.questionOne)
            }
            R.id.twoQues -> {
                val selectedTextView = findViewById<TextView>(R.id.selectTextView)
                selectedTextView.text = getString(R.string.questionTwo)
            }
            R.id.threeQues -> {
                val selectedTextView = findViewById<TextView>(R.id.selectTextView)
                selectedTextView.text = getString(R.string.questionThree)
            }
            R.id.fourQues -> {
                val selectedTextView = findViewById<TextView>(R.id.selectTextView)
                selectedTextView.text = getString(R.string.questionFour)
            }
            R.id.fiveQues -> {
                val selectedTextView = findViewById<TextView>(R.id.selectTextView)
                selectedTextView.text = getString(R.string.questionFive)

            }
        }
    }
}