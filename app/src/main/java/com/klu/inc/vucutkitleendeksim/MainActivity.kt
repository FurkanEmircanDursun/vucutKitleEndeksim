package com.klu.inc.vucutkitleendeksim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




    }


    fun calculate(view: View){
        val toast =Toast.makeText(this,"please enter value",Toast.LENGTH_SHORT)


        if(boyText.text.toString()=="" || kiloText.text.toString()==""){


        toast.show()
        }
        else{

val kilo =kiloText.text.toString().toFloat()
        val boy =boyText.text.toString().toFloat()
        // i used decimal format
    val vki=(10000*kilo)/(boy*boy)
        val dec =DecimalFormat("#,###.##")

        sonuc.text=" your BMI ${dec.format(vki)}"
}}

}