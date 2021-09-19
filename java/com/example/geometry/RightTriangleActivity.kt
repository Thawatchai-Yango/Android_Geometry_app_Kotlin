package com.example.geometry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

var getHright_tri: EditText? =null;
var getBright_tri: EditText? =null;
var getDright_tri: EditText? =null;
var showPerRight_tri: TextView? =null;
var showAreaRight_tri: TextView? =null;
var butCalRight_tri: Button? = null;

class RightTriangleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_right_triangle)

        getHright_tri = findViewById(R.id.inputH_right_tri) as EditText
        getBright_tri = findViewById(R.id.inputB_right_tri) as EditText
        getDright_tri = findViewById(R.id.inputD_right_tri) as EditText
        showPerRight_tri = findViewById(R.id.outputPerRight_tri) as TextView
        showAreaRight_tri = findViewById(R.id.outputAreaRight_tri) as TextView
        butCalRight_tri = findViewById(R.id.buttonRight_tri) as Button

        butCalRight_tri!!.setOnClickListener{
            var stringH = getHright_tri!!.getText().toString()
            var stringB = getBright_tri!!.getText().toString()
            var stringD = getDright_tri!!.getText().toString()

            if(stringH =="" && stringB =="" && stringD ==""){
                showPerRight_tri!!.setText("input any value")
                showAreaRight_tri!!.setText("input any value")
            }

            else if(stringB =="" && stringD ==""){
                showPerRight_tri!!.setText("input b-d")
                showAreaRight_tri!!.setText("input b")
            }

            else if(stringH =="" && stringD ==""){
                showPerRight_tri!!.setText("input h-d")
                showAreaRight_tri!!.setText("input h")
            }

            else if(stringH =="" && stringB ==""){
                showPerRight_tri!!.setText("input h-b")
                showAreaRight_tri!!.setText("input h-b")
            }

            else if(stringB ==""){
                showPerRight_tri!!.setText("input b")
                showAreaRight_tri!!.setText("input b")
            }

            else if(stringH ==""){
                showPerRight_tri!!.setText("input h")
                showAreaRight_tri!!.setText("input h")
            }

            else if(stringD ==""){
                showPerRight_tri!!.setText("input d")

                var floatB =stringB!!.toFloat()
                var floatH =stringH!!.toFloat()
                var areaFloat = 0.5 * floatB * floatH
                var areaFloat2 = String.format("%.2f", areaFloat)
                showAreaRight_tri!!.setText("$areaFloat2")
            }

            else{

                var floatH =stringH!!.toFloat()
                var floatB =stringB!!.toFloat()
                var floatD =stringH!!.toFloat()

                var perFloat = floatH + floatB + floatD
                var perFloat2 = String.format("%.2f", perFloat)
                showPerRight_tri!!.setText("$perFloat2")

                var areaFloat = 0.5 * floatB * floatH
                var areaFloat2 = String.format("%.2f", areaFloat)
                showAreaRight_tri!!.setText("$areaFloat2")
            }

        }
        
    }
}