package com.example.uts201804013


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Web : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        val webviewku: WebView = findViewById(R.id.webviewku)
        webviewku.settings.javaScriptEnabled = true
//        webviewku.loadUrl("https://www.zalora.co.id/")
        webviewku.loadUrl("file:///android_asset/web/index.html")
    }
}