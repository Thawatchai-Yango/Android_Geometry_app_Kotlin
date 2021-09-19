package com.example.geometry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

var getAtrape: EditText? =null;
var getBtrape: EditText? =null;
var getHtrape: EditText? =null;
var showPerTrape: TextView? =null;
var showAreaTrape: TextView? =null;
var butCalTrape: Button? = null;

class TrapeziumActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trapezium)

        getAtrape= findViewById(R.id.inputA_trapezium) as EditText
        getBtrape = findViewById(R.id.inputB_trapezium) as EditText
        getHtrape = findViewById(R.id.inputH_trapezium) as EditText
        showPerTrape = findViewById(R.id.outputPerTrapezium) as TextView
        showAreaTrape= findViewById(R.id.outputAreaTrapezium) as TextView
        butCalTrape = findViewById(R.id.buttonTrapezium) as Button

        butCalTrape!!.setOnClickListener{
            var stringA = getAtrape!!.getText().toString()
            var stringB = getBtrape!!.getText().toString()
            var stringH = getHtrape!!.getText().toString()

            if(stringA == "" && stringB =="" && stringH ==""){
                showPerTrape!!.setText("sum 4 sides")
                showAreaTrape!!.setText("input any value")
            }

            else if(stringB =="" && stringH==""){
                showPerTrape!!.setText("sum 4 sides")
                showAreaTrape!!.setText("input b-h")
            }

            else if(stringA =="" && stringH==""){
                showPerTrape!!.setText("sum 4 sides")
                showAreaTrape!!.setText("input a-h")
            }

            else if(stringA =="" && stringB==""){
                showPerTrape!!.setText("sum 4 sides")
                showAreaTrape!!.setText("input a-b")
            }

            else if(stringA ==""){
                showPerTrape!!.setText("sum 4 sides")
                showAreaTrape!!.setText("input a")
            }

            else if(stringB ==""){
                showPerTrape!!.setText("sum 4 sides")
                showAreaTrape!!.setText("input b ")
            }

            else if(stringH =="") {
                showPerTrape!!.setText("sum 4 sides")
                showAreaTrape!!.setText("input h")
            }

            else {
                var floatA = stringA!!.toFloat()
                var floatB = stringB!!.toFloat()
                var floatH = stringH!!.toFloat()

                showPerTrape!!.setText("sum 4 sides")

                var areaFloat = 0.5 * (floatH*(floatA+floatB))
                var areaFloat2 = String.format("%.2f", areaFloat)
                showAreaTrape!!.setText("$areaFloat2")
            }

        }

    }
}