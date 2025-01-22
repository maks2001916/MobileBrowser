package com.example.mobilebrowser

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class WebViewActivity : AppCompatActivity() {

    private lateinit var toolbarTB: Toolbar
    private lateinit var webViewWV: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_web_view)

        toolbarTB = findViewById(R.id.webViewTB)
        webViewWV = findViewById(R.id.webViewWV)
        webViewWV.webViewClient = WebViewClient()
        var data = intent.data
        webViewWV.loadUrl(data.toString())
        setSupportActionBar(toolbarTB)

    }
}