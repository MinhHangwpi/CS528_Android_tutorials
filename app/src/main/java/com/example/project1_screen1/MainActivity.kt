package com.example.project1_screen1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val checkBox: CheckBox = findViewById(R.id.checkbox)

        checkBox.setOnCheckedChangeListener{ checkboxView, isChecked ->
            val id = checkboxView.id
            Log.d("CHECKBOX", "checkbox id $id with isCheckedStatus: $isChecked")
        }
    }
}