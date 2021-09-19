package com.example.geometry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

var getRcircle: EditText? =null;
var showPerCircle: TextView? =null;
var showAreaCircle: TextView? =null;
var butCalCircle: Button? = null;

class CircleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circle)

        getRcircle = findViewById(R.id.inputR_circle) as EditText
        showPerCircle = findViewById(R.id.outputPerCircle) as TextView
        showAreaCircle = findViewById(R.id.outputAreaCircle) as TextView
        butCalCircle = findViewById(R.id.buttonCircle) as Button

        butCalCircle!!.setOnClickListener {
            var stringR = getRcircle!!.getText().toString()
            if (stringR == "") {
                showPerCircle!!.setText("input r")
                showAreaCircle!!.setText("input r")
            } else {
                var floatR = stringR!!.toFloat()

                var perFloat = 2.0 * 3.14 * floatR
                var perFloat2 = String.format("%.2f", perFloat)
                showPerCircle!!.setText("$perFloat2")

                var areaFloat = 3.14 * (floatR * floatR)
                var areaFloat2 = String.format("%.2f", areaFloat)
                showAreaCircle!!.setText("$areaFloat2")
            }
        }
    }
}