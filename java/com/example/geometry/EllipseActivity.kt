package com.example.geometry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.sqrt

var getAellipse: EditText? =null;
var getBellips: EditText? =null;
var showPerEllipse: TextView? =null;
var showAreaEllipse: TextView? =null;
var butCalEllipse: Button? = null;

class EllipseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ellipse)

        getAellipse = findViewById(R.id.inputA_ellipse) as EditText
        getBellips = findViewById(R.id.inputB_ellipse) as EditText
        showPerEllipse = findViewById(R.id.outputPerEllipse) as TextView
        showAreaEllipse = findViewById(R.id.outputAreaEllipse) as TextView
        butCalEllipse = findViewById(R.id.buttonEllipse) as Button

        butCalEllipse!!.setOnClickListener{
            var stringA = getAellipse!!.getText().toString()
            var stringB = getBellips!!.getText().toString()

            if(stringA == "" && stringB ==""){
                showPerEllipse!!.setText("input any value")
                showAreaEllipse!!.setText("input any value")
            }
            else if(stringA ==""){
                showPerEllipse!!.setText("input a")
                showAreaEllipse!!.setText("input a")
            }
            else if(stringB ==""){
                showPerEllipse!!.setText("input b")
                showAreaEllipse!!.setText("input b")
            }
            else{
                var floatA = stringA!!.toFloat()
                var floatB = stringB!!.toFloat()


                var perFloat = 3.14*((3.0*(floatA+floatB))- (sqrt((floatA + (3.0 * floatB))*(floatB + (3.0 * floatA)))))
                var perFloat2 = String.format("%.2f", perFloat)
                showPerEllipse!!.setText("$perFloat2")

                var areaFloat = 3.14 *floatA * floatB
                var areaFloat2 = String.format("%.2f", areaFloat)
                showAreaEllipse!!.setText("$areaFloat2")
            }
        }
    }
}