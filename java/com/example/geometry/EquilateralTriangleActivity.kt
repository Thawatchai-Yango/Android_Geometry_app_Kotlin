package com.example.geometry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

var getAequi_tri: EditText? =null;
var getHequi_tri: EditText? =null;
var showPerEqui_tri: TextView? =null;
var showAreaEqui_tri: TextView? =null;
var butCalEqui_tri: Button? = null;

class EquilateralTriangleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_equilateral_triangle)

        getAequi_tri = findViewById(R.id.inputA_equi_triangle) as EditText
        getHequi_tri = findViewById(R.id.inputH_equi_triangle) as EditText
        showPerEqui_tri = findViewById(R.id.outputPerEqui_triangle) as TextView
        showAreaEqui_tri = findViewById(R.id.outputAreaEqui_triangle) as TextView
        butCalEqui_tri = findViewById(R.id.buttonEqui_triangle) as Button

        butCalEqui_tri!!.setOnClickListener{
            var stringA = getAequi_tri!!.getText().toString()
            var stringH = getHequi_tri!!.getText().toString()

            if(stringA =="" && stringH ==""){
                showPerEqui_tri!!.setText("input any value")
                showAreaEqui_tri!!.setText("input any value")
            }

            else if(stringA ==""){
                showPerEqui_tri!!.setText("input a")
                showAreaEqui_tri!!.setText("input a")
            }

            else if(stringH ==""){
                var floatA = stringA!!.toFloat()
                var perFloat = 3.0 *floatA
                var perFloat2 = String.format("%.2f", perFloat)
                showPerEqui_tri!!.setText("$perFloat2")
                showAreaEqui_tri!!.setText("input h")
            }

            else{
                var floatA = stringA!!.toFloat()
                var floatH = stringH!!.toFloat()

                var perFloat = 3.0 *floatA
                var perFloat2 = String.format("%.2f", perFloat)
                showPerEqui_tri!!.setText("$perFloat2")

                var areaFloat = 0.5 * floatA * floatH
                var areaFloat2 = String.format("%.2f", areaFloat)
                showAreaEqui_tri!!.setText("$areaFloat2")
            }

        }
    }
}