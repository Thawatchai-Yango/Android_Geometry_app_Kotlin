package com.example.geometry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

var getRsemi_circle: EditText? =null;
var showPerSemi_Circle: TextView? =null;
var showAreaSemi_Circle: TextView? =null;
var butCalSemi_Circle: Button? = null;

class SemiCircleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_semi_circle)

        getRsemi_circle = findViewById(R.id.inputR_semi_circle) as EditText
        showPerSemi_Circle = findViewById(R.id.outputPerSemi_Circle) as TextView
        showAreaSemi_Circle = findViewById(R.id.outputAreaSemi_Circle) as TextView
        butCalSemi_Circle = findViewById(R.id.buttonSemi_Circle) as Button

        butCalSemi_Circle!!.setOnClickListener {
            var stringR = getRsemi_circle!!.getText().toString()
            if (stringR == "") {
                showPerSemi_Circle!!.setText("input r")
                showAreaSemi_Circle!!.setText("input r")
            } else {
                var floatR = stringR!!.toFloat()

                var perFloat = (3.14*floatR) + (2.0 * floatR)
                var perFloat2 = String.format("%.2f", perFloat)
                showPerSemi_Circle!!.setText("$perFloat2")

                var areaFloat = 0.5*(3.14 * (floatR * floatR))
                var areaFloat2 = String.format("%.2f", areaFloat)
                showAreaSemi_Circle!!.setText("$areaFloat2")
            }
        }
    }
}