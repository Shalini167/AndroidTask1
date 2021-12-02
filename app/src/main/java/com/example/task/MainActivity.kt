package com.example.task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clickdisplay=findViewById<TextView>(R.id.clickcolor)
        val rclick=findViewById<TextView>(R.id.clickred)
        val gclick=findViewById<TextView>(R.id.clickgreen)
        val bclick=findViewById<TextView>(R.id.clickblue)
        rclick.setOnClickListener{
            clickdisplay.text=("Red was clicked")
        }
        gclick.setOnClickListener{
            clickdisplay.text=("Green was clicked")
        }
        bclick.setOnClickListener {
            clickdisplay.text=("Blue was clicked")
        }
    }
}