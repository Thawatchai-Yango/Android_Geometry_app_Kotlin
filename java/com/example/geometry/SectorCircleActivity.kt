package com.example.geometry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

var getRsector_circle: EditText? =null;
var getTsector_circle: EditText? =null;
var showPerSector_circle: TextView? =null;
var showAreaSector_circle: TextView? =null;
var butCalSector_circle: Button? = null;

class SectorCircleActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sector_circle)

        getRsector_circle = findViewById(R.id.inputR_sector_circle) as EditText
        getTsector_circle = findViewById(R.id.inputTheta_sector_circle) as EditText
        showPerSector_circle = findViewById(R.id.outputPerSectorCircle) as TextView
        showAreaSector_circle = findViewById(R.id.outputAreaSectorCircle) as TextView
        butCalSector_circle = findViewById(R.id.buttonSectorCircle) as Button

        butCalSector_circle!!.setOnClickListener {
            var stringR =  getRsector_circle!!.getText().toString()
            var stringTheta = getTsector_circle!!.getText().toString()

            if (stringR == "" && stringTheta =="") {
                showPerSector_circle!!.setText("input r-Theta")
                showAreaSector_circle!!.setText("input r-Theta")
            }

            else if(stringR ==""){
                showPerSector_circle!!.setText("input r")
                showAreaSector_circle!!.setText("input r")
            }

            else if(stringTheta ==""){
                showPerSector_circle!!.setText("input Theta")
                showAreaSector_circle!!.setText("input Theta")
            }

            else {
                var floatR = stringR!!.toFloat()
                var floatTheta = stringTheta!!.toFloat()
                var i = (floatTheta/360.0) * (2.0*3.14*floatR)
                var iFloat =i!!.toFloat()

                var perFloat = iFloat +(2.0 * floatR)
                var perFloat2 = String.format("%.2f", perFloat)
                showPerSector_circle!!.setText("$perFloat2")

                var areaFloat = (floatTheta/360.0) * (3.14*(floatR*floatR))
                var areaFloat2 = String.format("%.2f", areaFloat)
                showAreaSector_circle!!.setText("$areaFloat2")
            }
        }
    }
}