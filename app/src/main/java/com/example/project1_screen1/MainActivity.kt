package com.example.project1_screen1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var counter1 = 0
        val textView1 = findViewById<TextView>(R.id.button1_text)
        val image1 = findViewById<ImageView>(R.id.image1)

        image1.setOnClickListener{
            counter1 += 1
            textView1.text = "You have pressed picture 1 $counter1 times"
        }

    }
}