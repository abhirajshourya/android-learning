package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
/**
* This Activity allows the user to roll a dice and view
* the result on the screen
*/
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener{ rollDice() }
    }
    /**
     * Roll the dice and update the screen
     */
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)

        // Update the screen with dice roll
        toast.show()
        resultTextView.text = diceRoll.toString()
    }
}

class Dice(private val diceSides: Int){
    fun roll(): Int {
        return (1..diceSides).random()
    }
}