package com.hfad.beeradvisor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import android.widget.Spinner
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val findBeer = findViewById<Button>(R.id.find_beer)
        findBeer.setOnClickListener{
            val beerColor = findViewById<Spinner>(R.id.beer_color)
            val color = beerColor.selectedItem.toString()
            val brands = findViewById<TextView>(R.id.brands)
            brands.text = "${getBeers(color).joinToString(" " + "\n")}"
            //brands.text=found.joinToString("\n") alternative

        }
    }
    fun getBeers(color:String):List<String>{
        return when(color){
            "Light"->listOf("Jail Pale Ale","Lager Lite")
            "Amber"->listOf("Jack Amber", "Red Moose")
            "Brown"->listOf("Brown Bear Beer", "Bock Brownie")
            else->listOf("Gout Stout", "Dark Daniel")
        }

    }
}