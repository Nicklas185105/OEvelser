package com.example.oevelser;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        WebView webView = new WebView(this);
        webView = findViewById(R.id.WebView);
        webView.loadUrl(MainActivity.urlEditText.toString());

    }
}
