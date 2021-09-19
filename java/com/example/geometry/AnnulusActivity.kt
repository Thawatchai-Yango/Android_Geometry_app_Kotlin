package com.example.geometry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

var getRannulus: EditText? =null;
var getRbigannulus: EditText? =null;
var showAreaAnnulus: TextView? =null;
var butCalAnnulus: Button? = null;

class AnnulusActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_annulus)

        getRannulus = findViewById(R.id.inputR_annulus) as EditText
        getRbigannulus = findViewById(R.id.inputRbig_annulus) as EditText
        showAreaAnnulus = findViewById(R.id.outputAreaAnnulus) as TextView
        butCalAnnulus = findViewById(R.id.buttonAnnulus) as Button

        butCalAnnulus!!.setOnClickListener {
            var stringR =  getRannulus!!.getText().toString()
            var stringRbig = getRbigannulus!!.getText().toString()

            if (stringR == "" && stringRbig =="") {
                showAreaAnnulus!!.setText("input r-R")
            }

            else if(stringR ==""){
                showAreaAnnulus!!.setText("input r")
            }

            else if(stringRbig ==""){
                showAreaAnnulus!!.setText("input R")
            }

            else {
                var floatR = stringR!!.toFloat()
                var floatRbig = stringRbig!!.toFloat()

                var areaFloat = 3.14*((floatRbig*floatRbig)-(floatR*floatR))
                var areaFloat2 = String.format("%.2f", areaFloat)
                showAreaAnnulus!!.setText("$areaFloat2")
            }
        }
    }
}