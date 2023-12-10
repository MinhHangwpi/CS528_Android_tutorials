package com.example.project1_screen1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView = findViewById<WebView>(R.id.webView)
        val button1 = findViewById<Button>(R.id.button1)

        button1.setOnClickListener {
            webView.webViewClient = WebViewClient()
            webView.loadUrl("https://www.google.com")
            webView.settings.javaScriptEnabled = true
            webView.settings.setSupportZoom(true)
        }
    }
}