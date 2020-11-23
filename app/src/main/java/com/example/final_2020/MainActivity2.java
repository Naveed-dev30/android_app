package com.example.final_2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity2 extends AppCompatActivity {
    WebView myWebView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent mIntent = getIntent();

        myWebView= (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("http://www."+mIntent.getStringExtra("name")+".com");
    }
}