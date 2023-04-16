package com.example.mmilapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    companion object{
       const val KEY1=" com.example.mmilapp.MainActivity.KEY1"
       const val KEY2=" com.example.mmilapp.MainActivity.KEY2"
        const val KEY3=" com.example.mmilapp.MainActivity.KEY3"
    }
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

   val calculate = findViewById<Button>(R.id.CALCULATE)

        calculate.setOnClickListener {
            val input1=mass1.text.toString().toInt()
           val input2=volume.text.toString().toInt()
            val input3=distance.text.toString().toInt()

            val intent = Intent(this,Calculations::class.java)
            startActivity(intent)
            intent.putExtra(KEY1,input1)
          intent.putExtra(KEY2,input2)
            intent.putExtra(KEY3,input3)
            startActivity(intent)

        }
    }
}