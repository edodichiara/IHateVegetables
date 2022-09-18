package com.example.ihatevegetables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var listId: List<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializeList()

        button.setOnClickListener{
            pickVegetable()
        }

        pickVegetable()
    }

    private fun pickVegetable(){
        imageView.setImageResource(listId.random())
    }

    private fun initializeList (){
        listId = listOf(
            R.drawable.icon_artichoke,
            R.drawable.icon_beans,
            R.drawable.icon_asparagus,
            R.drawable.icon_beep,
            R.drawable.icon_bell_pepper,
            R.drawable.icon_broccoli,
            R.drawable.icon_cabbage,
            R.drawable.icon_carrot,
            R.drawable.icon_cauliflower,
            R.drawable.icon_chili_pepper,
            R.drawable.icon_cucumber,
            R.drawable.icon_date_fruit,
            R.drawable.icon_eggplant,
            R.drawable.icon_garlic,
            R.drawable.icon_peas,
            R.drawable.icon_pepper,
            R.drawable.icon_potato,
            R.drawable.icon_pumpkin,
            R.drawable.icon_radish,
            R.drawable.icon_redonion,
            R.drawable.icon_salad,
            R.drawable.icon_spinach,
            R.drawable.icon_turnip
        )
    }
}