package com.example.geometry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

var getNpolygon: EditText? =null;
var getApolygon: EditText? =null;
var getSpolygon: EditText? =null;
var showPerPolygon: TextView? =null;
var showAreaPolygon: TextView? =null;
var butCalPolygon: Button? = null;

class PolygonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_polygon)

        getNpolygon= findViewById(R.id.inputN_polygon) as EditText
        getApolygon = findViewById(R.id.inputA_polygon) as EditText
        getSpolygon = findViewById(R.id.inputS_polygon) as EditText
        showPerPolygon = findViewById(R.id.outputPerPolygon) as TextView
        showAreaPolygon = findViewById(R.id.outputAreaPolygon) as TextView
        butCalPolygon = findViewById(R.id.buttonPolygon) as Button

        butCalPolygon!!.setOnClickListener{
            var stringN = getNpolygon!!.getText().toString()
            var stringA = getApolygon!!.getText().toString()
            var stringS = getSpolygon!!.getText().toString()

            if(stringN =="" && stringA =="" && stringS =="" ){
                showPerPolygon!!.setText("input any value")
                showAreaPolygon!!.setText("input any value")
            }

            else if(stringA =="" && stringS =="" ){
                showPerPolygon!!.setText("input s")
                showAreaPolygon!!.setText("input a-s")
            }

            else if(stringN =="" && stringS =="" ){
                showPerPolygon!!.setText("input n-s")
                showAreaPolygon!!.setText("input any n-s")
            }

            else if(stringN =="" && stringA ==""){
                showPerPolygon!!.setText("input n")
                showAreaPolygon!!.setText("input n-a")
            }

            else if(stringN ==""){
                showPerPolygon!!.setText("input n")
                showAreaPolygon!!.setText("input n")
            }

            else if(stringA ==""){
                var floatN = stringN!!.toFloat()
                var floatS = stringS!!.toFloat()

                var perFloat = floatN * floatS
                var perFloat2 = String.format("%.2f", perFloat)
                showPerPolygon!!.setText("$perFloat2")
                showAreaPolygon!!.setText("input a")
            }

            else if(stringS ==""){
                showPerPolygon!!.setText("input s")
                showAreaPolygon!!.setText("input s")
            }

            else{
                var floatN = stringN!!.toFloat()
                var floatA = stringA!!.toFloat()
                var floatS = stringS!!.toFloat()

                var perFloat = floatN * floatS
                var perFloat2 = String.format("%.2f", perFloat)
                showPerPolygon!!.setText("$perFloat2")

                var areaFloat = floatN*(0.5*floatA*floatS)
                var areaFloat2 = String.format("%.2f", areaFloat)
                showAreaPolygon!!.setText("$areaFloat2")


            }

        }

    }
}