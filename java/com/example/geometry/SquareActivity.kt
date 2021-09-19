package com.example.geometry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

var getAsquare: EditText? =null;
var showPerSquare: TextView? =null;
var showAreaSquare: TextView? =null;
var butCalSquare: Button? = null;

class SquareActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_square)

        getAsquare = findViewById(R.id.inputA_square) as EditText
        showPerSquare = findViewById(R.id.outputPerSquare) as TextView
        showAreaSquare = findViewById(R.id.outputAreaSquare) as TextView
        butCalSquare = findViewById(R.id.buttonSquare) as Button

        butCalSquare!!.setOnClickListener{
            var stringA = getAsquare!!.getText().toString()
            if(stringA == ""){
                showPerSquare!!.setText("input a")
                showAreaSquare!!.setText("input a")
            }

            else{
                var floatA = stringA!!.toFloat()
                
                var perFloat = 4.0 *floatA
                var perFloat2 = String.format("%.2f", perFloat)
                showPerSquare!!.setText("$perFloat2")

                var areaFloat = floatA * floatA
                var areaFloat2 = String.format("%.2f", areaFloat)
                showAreaSquare!!.setText("$areaFloat2")
            }
        }
    }
}