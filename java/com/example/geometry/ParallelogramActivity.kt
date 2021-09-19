package com.example.geometry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

var getAparal: EditText? =null;
var getBparal: EditText? =null;
var getHparal: EditText? =null;
var showPerParal: TextView? =null;
var showAreaParal: TextView? =null;
var butCalParal: Button? = null;

class ParallelogramActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parallelogram)

        getAparal= findViewById(R.id.inputA_parallelogram) as EditText
        getBparal = findViewById(R.id.inputB_parallelogram) as EditText
        getHparal = findViewById(R.id.inputH_parallelogram) as EditText
        showPerParal = findViewById(R.id.outputPerParallelogram) as TextView
        showAreaParal = findViewById(R.id.outputAreaParallelogram) as TextView
        butCalParal = findViewById(R.id.buttonParallelogram) as Button

        butCalParal!!.setOnClickListener{
            var stringA = getAparal!!.getText().toString()
            var stringB = getBparal!!.getText().toString()
            var stringH = getHparal!!.getText().toString()

            if(stringA == "" && stringB =="" && stringH ==""){
                showPerParal!!.setText("input any value")
                showAreaParal!!.setText("input any value")
            }

            else if(stringB =="" && stringH==""){
                showPerParal!!.setText("input b")
                showAreaParal!!.setText("input h")
            }

            else if(stringA =="" && stringB==""){
                showPerParal!!.setText("input a-b")
                showAreaParal!!.setText("input a")
            }

            else if(stringA =="" && stringH==""){
                showPerParal!!.setText("input a")
                showAreaParal!!.setText("input a-h")
            }

            else if(stringH ==""){
                var floatA = stringA!!.toFloat()
                var floatB = stringB!!.toFloat()

                var perFloat = 2.0 * (floatA + floatB)
                var perFloat2 = String.format("%.2f", perFloat)
                showPerParal!!.setText("$perFloat2")
                showAreaParal!!.setText("input h")
            }

            else if(stringB =="") {
                var floatA = stringA!!.toFloat()
                var floatH = stringH!!.toFloat()

                var areaFloat = floatA * floatH
                var areaFloat2 = String.format("%.2f", areaFloat)
                showPerParal!!.setText("input b")
                showAreaParal!!.setText("$areaFloat2")
            }

            else if(stringA =="") {
                showPerParal!!.setText("input a")
                showAreaParal!!.setText("input a")
            }

            else {
                var floatA = stringA!!.toFloat()
                var floatB = stringB!!.toFloat()
                var floatH = stringH!!.toFloat()

                var perFloat = 2.0 * (floatA + floatB)
                var perFloat2 = String.format("%.2f", perFloat)
                showPerParal!!.setText("$perFloat2")

                var areaFloat = floatA * floatH
                var areaFloat2 = String.format("%.2f", areaFloat)
                showAreaParal!!.setText("$areaFloat2")
            }

        }
    }
}