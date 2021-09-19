package com.example.geometry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

var getAiso_tri: EditText? =null;
var getDiso_tri: EditText? =null;
var showPerIso_tri: TextView? =null;
var showAreaIso_tri: TextView? =null;
var butCalIso_tri: Button? = null;

class IosRightTriangleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ios_right_triangle)

        getAiso_tri = findViewById(R.id.inputA_iso_triangle) as EditText
        getDiso_tri = findViewById(R.id.inputD_iso_triangle) as EditText
        showPerIso_tri = findViewById(R.id.outputPerIso_triangle) as TextView
        showAreaIso_tri = findViewById(R.id.outputAreaIso_triangle) as TextView
        butCalIso_tri = findViewById(R.id.buttonIso_triangle) as Button

        butCalIso_tri!!.setOnClickListener{
            var stringA = getAiso_tri!!.getText().toString()
            var stringD = getDiso_tri!!.getText().toString()

            if(stringA =="" && stringD ==""){
                showPerIso_tri!!.setText("input any value")
                showAreaIso_tri!!.setText("input any value")
            }

            else if(stringA ==""){
                showPerIso_tri!!.setText("input a")
                showAreaIso_tri!!.setText("input a")
            }

            else if(stringD ==""){
                showPerIso_tri!!.setText("input d")

                var floatA = stringA!!.toFloat()
                var areaFloat = 0.5 * (floatA * floatA)
                var areaFloat2 = String.format("%.2f", areaFloat)
                showAreaIso_tri!!.setText("$areaFloat2")
            }

            else{
                var floatA = stringA!!.toFloat()
                var floatD = stringD!!.toFloat()

                var perFloat = (2.0 * floatA) + floatD
                var perFloat2 = String.format("%.2f", perFloat)
                showPerIso_tri!!.setText("$perFloat2")

                var areaFloat = 0.5 * (floatA * floatA)
                var areaFloat2 = String.format("%.2f", areaFloat)
                showAreaIso_tri!!.setText("$areaFloat2")
            }


        }

    }
}