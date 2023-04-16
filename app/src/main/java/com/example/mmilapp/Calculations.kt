package com.example.mmilapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculations.*

class Calculations : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculations)


      val   m =intent.getIntExtra(MainActivity.KEY1,0)
      val   v=intent.getIntExtra(MainActivity.KEY2,0)
      val   d=intent.getIntExtra(MainActivity.KEY3,0)

        textView1.text= "Mass in grams(gms) is "+(m*1000).toString()+" gms"
        textView2.text="Volume in liters(l) is "+(v*1000).toString()+" l"
        textView3.text="Distance in meters(m) is "+(d*1000).toString()+" m"
    }
}