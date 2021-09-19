package com.example.geometry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

var getAger_tri: EditText? =null;
var getBger_tri: EditText? =null;
var getCger_tri: EditText? =null;
var getHger_tri: EditText? =null;
var showPerGer_tri: TextView? =null;
var showAreaGer_tri: TextView? =null;
var butCalGer_tri: Button? = null;

class GeneralTriangleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_general_triangle)

        getAger_tri = findViewById(R.id.inputA_ger_triangle) as EditText
        getBger_tri = findViewById(R.id.inputB_ger_triangle) as EditText
        getCger_tri = findViewById(R.id.inputC_ger_triangle) as EditText
        getHger_tri = findViewById(R.id.inputH_ger_triangle) as EditText
        showPerGer_tri = findViewById(R.id.outputPerGer_triangle) as TextView
        showAreaGer_tri = findViewById(R.id.outputAreaGer_triangle) as TextView
        butCalGer_tri = findViewById(R.id.buttonGer_triangle) as Button

        butCalGer_tri!!.setOnClickListener{
            var stringA = getAger_tri!!.getText().toString()
            var stringB = getBger_tri!!.getText().toString()
            var stringC = getCger_tri!!.getText().toString()
            var stringH = getHger_tri!!.getText().toString()

            if(stringA =="" && stringB =="" && stringC =="" && stringH ==""){
                showPerGer_tri!!.setText("input any value")
                showAreaGer_tri!!.setText("input any value")
            }

            else if(stringB =="" && stringC =="" && stringH ==""){
                showPerGer_tri!!.setText("input b-c")
                showAreaGer_tri!!.setText("input b-h")
            }

            else if(stringA =="" && stringC =="" && stringH ==""){
                showPerGer_tri!!.setText("input a-c")
                showAreaGer_tri!!.setText("input h")
            }

            else if(stringA =="" && stringB =="" && stringH ==""){
                showPerGer_tri!!.setText("input a-b")
                showAreaGer_tri!!.setText("input b-h")
            }

            else if(stringA =="" && stringB =="" && stringC ==""){
                showPerGer_tri!!.setText("input a-b-c")
                showAreaGer_tri!!.setText("input b")
            }

            else if(stringC =="" && stringH =="" ){
                showPerGer_tri!!.setText("input c")
                showAreaGer_tri!!.setText("input h")
            }

            else if(stringA =="" && stringH =="" ){
                showPerGer_tri!!.setText("input a")
                showAreaGer_tri!!.setText("input h")
            }

            else if(stringA =="" && stringB =="" ){
                showPerGer_tri!!.setText("input a-b")
                showAreaGer_tri!!.setText("input b")
            }

            else if(stringB =="" && stringC =="" ){
                showPerGer_tri!!.setText("input b-c")
                showAreaGer_tri!!.setText("input b")
            }

            else if(stringB =="" && stringH =="" ){
                showPerGer_tri!!.setText("input b")
                showAreaGer_tri!!.setText("input b-h")
            }

            else if(stringA =="" && stringC =="" ){
                showPerGer_tri!!.setText("input a-c")
                var floatB = stringB!!.toFloat()
                var floatH = stringH!!.toFloat()
                var areaFloat = 0.5 * floatB * floatH
                var areaFloat2 = String.format("%.2f", areaFloat)
                showAreaGer_tri!!.setText("$areaFloat2")
            }

            else if(stringA ==""){
                showPerGer_tri!!.setText("input a")
                var floatB = stringB!!.toFloat()
                var floatH = stringH!!.toFloat()
                var areaFloat = 0.5 * floatB * floatH
                var areaFloat2 = String.format("%.2f", areaFloat)
                showAreaGer_tri!!.setText("$areaFloat2")
            }

            else if(stringB ==""){
                showPerGer_tri!!.setText("input B")
                showAreaGer_tri!!.setText("input B")
            }

            else if(stringC ==""){
                showPerGer_tri!!.setText("input c")
                var floatB = stringB!!.toFloat()
                var floatH = stringH!!.toFloat()
                var areaFloat = 0.5 * floatB * floatH
                var areaFloat2 = String.format("%.2f", areaFloat)
                showAreaGer_tri!!.setText("$areaFloat2")
            }


            else if(stringH ==""){
                var floatA = stringA!!.toFloat()
                var floatB = stringB!!.toFloat()
                var floatC = stringC!!.toFloat()
                var perFloat = floatA + floatB + floatC
                var perFloat2 = String.format("%.2f", perFloat)
                showPerGer_tri!!.setText("$perFloat2")
                showAreaGer_tri!!.setText("input h")
            }

            else{
                var floatA = stringA!!.toFloat()
                var floatB = stringB!!.toFloat()
                var floatC = stringC!!.toFloat()
                var floatH = stringH!!.toFloat()

                var perFloat = floatA + floatB + floatC
                var perFloat2 = String.format("%.2f", perFloat)
                showPerGer_tri!!.setText("$perFloat2")

                var areaFloat = 0.5 * floatB * floatH
                var areaFloat2 = String.format("%.2f", areaFloat)
                showAreaGer_tri!!.setText("$areaFloat2")


            }



        }
    }
}