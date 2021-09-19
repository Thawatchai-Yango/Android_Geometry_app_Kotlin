package com.example.geometry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

var getArec: EditText? =null;
var getBrec: EditText? =null;
var showPerRec: TextView? =null;
var showAreaRec: TextView? =null;
var butCalRec: Button? = null;

class RectangleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rectangle)

        getArec = findViewById(R.id.inputA_rectangle) as EditText
        getBrec = findViewById(R.id.inputB_rectangle) as EditText
        showPerRec = findViewById(R.id.outputPerRectangle) as TextView
        showAreaRec = findViewById(R.id.outputAreaRectangle) as TextView
        butCalRec = findViewById(R.id.buttonRectangle) as Button

        butCalRec!!.setOnClickListener{
            var stringA = getArec!!.getText().toString()
            var stringB = getBrec!!.getText().toString()

            if(stringA == "" && stringB ==""){
                showPerRec!!.setText("input any value")
                showAreaRec!!.setText("input any value")
            }
            else if(stringA ==""){
                showPerRec!!.setText("input a")
                showAreaRec!!.setText("input a")
            }
            else if(stringB ==""){
                showPerRec!!.setText("input b")
                showAreaRec!!.setText("input b")
            }
            else{
                var floatA = stringA!!.toFloat()
                var floatB = stringB!!.toFloat()


                    var perFloat = 2.0 * (floatA + floatB)
                    var perFloat2 = String.format("%.2f", perFloat)
                    showPerRec!!.setText("$perFloat2")

                    var areaFloat = floatA * floatB
                    var areaFloat2 = String.format("%.2f", areaFloat)
                    showAreaRec!!.setText("$areaFloat2")
            }
        }
    }
}