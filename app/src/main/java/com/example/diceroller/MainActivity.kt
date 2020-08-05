package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rollbtn.setOnClickListener{
            var rnd=Random.nextInt(6)+1
            var di=when(rnd){
                1 ->R.drawable.dice_1
                2 ->R.drawable.dice_2
                3 ->R.drawable.dice_3
                4 ->R.drawable.dice_4
                5 ->R.drawable.dice_5

                else -> R.drawable.dice_6
            }
            imgofdice.setImageResource(di)
        }
    }
}