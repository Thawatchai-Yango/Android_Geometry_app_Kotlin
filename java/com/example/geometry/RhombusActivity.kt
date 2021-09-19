package com.example.geometry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

var getArhombus: EditText? =null;
var getD1rhombus: EditText? =null;
var getD2rhombus: EditText? =null;
var showPerRhombus: TextView? =null;
var showAreaRhombus: TextView? =null;
var butCalRhombus: Button? = null;

class RhombusActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rhombus)

        getArhombus= findViewById(R.id.inputA_rhombus) as EditText
        getD1rhombus = findViewById(R.id.inputD1_rhombus) as EditText
        getD2rhombus = findViewById(R.id.inputD2_rhombus) as EditText
        showPerRhombus = findViewById(R.id.outputPerRhombus) as TextView
        showAreaRhombus = findViewById(R.id.outputAreaRhombus) as TextView
        butCalRhombus = findViewById(R.id.buttonRhombus) as Button

        butCalRhombus!!.setOnClickListener{
            var stringA = getArhombus!!.getText().toString()
            var stringD1 = getD1rhombus!!.getText().toString()
            var stringD2 = getD2rhombus!!.getText().toString()

            if(stringA == "" && stringD1 =="" && stringD2 ==""){
                showPerRhombus!!.setText("input any value")
                showAreaRhombus!!.setText("input any value")
            }

            else if(stringA == "" && stringD1 == ""){
                showPerRhombus!!.setText("input a")
                showAreaRhombus!!.setText("input d1")
            }

            else if(stringA == "" && stringD2 == ""){
                showPerRhombus!!.setText("input a")
                showAreaRhombus!!.setText("input d2")
            }

            else if(stringD1 =="" && stringD2 ==""){
                var floatA = stringA!!.toFloat()

                var perFloat = 4.0 * floatA
                var perFloat2 = String.format("%.2f", perFloat)
                showPerRhombus!!.setText("$perFloat2")
                showAreaRhombus!!.setText("input d1-d2")
            }

            else if(stringA ==""){
                var floatD1 = stringD1!!.toFloat()
                var floatD2 = stringD2!!.toFloat()

                var areaFloat = 0.5 * (floatD1 * floatD2)
                var areaFloat2 = String.format("%.2f", areaFloat)
                showPerRhombus!!.setText("input a")
                showAreaRhombus!!.setText("$areaFloat2")

            }

            else if(stringD1 ==""){
                var floatA = stringA!!.toFloat()

                var perFloat = 4.0 * floatA
                var perFloat2 = String.format("%.2f", perFloat)
                showPerRhombus!!.setText("$perFloat2")
                showAreaRhombus!!.setText("input d1")

            }

            else if(stringD2 ==""){
                var floatA = stringA!!.toFloat()

                var perFloat = 4.0 * floatA
                var perFloat2 = String.format("%.2f", perFloat)
                showPerRhombus!!.setText("$perFloat2")
                showAreaRhombus!!.setText("input d2")
            }

            else{
                var floatA = stringA!!.toFloat()
                var floatD1 = stringD1!!.toFloat()
                var floatD2 = stringD2!!.toFloat()

                var perFloat = 4.0 * floatA
                var perFloat2 = String.format("%.2f", perFloat)
                showPerRhombus!!.setText("$perFloat2")

                var areaFloat = 0.5 * (floatD1 * floatD2)
                var areaFloat2 = String.format("%.2f", areaFloat)
                showAreaRhombus!!.setText("$areaFloat2")

            }

        }
    }
}