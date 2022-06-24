package com.example.webactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class UrlActivity extends AppCompatActivity {

    WebView web;
    String website;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_url);

        web = findViewById(R.id.web);



//        web.setWebViewClient(new WebViewClient(){
//
//            @Override
//            public void onPageStarted(WebView view, String url, Bitmap favicon) {
//                super.onPageStarted(view, url, favicon);
//                prg.setVisibility(View.VISIBLE);
//                setTitle("Loading.......");
//            }
//
//            @Override
//            public void onPageFinished(WebView view, String url) {
//                super.onPageFinished(view, url);
//                prg.setVisibility(View.GONE);
//                setTitle(view.getTitle());
//            }
//        });
        Intent intent = getIntent();
        website = intent.getStringExtra("link");

        web.loadUrl(website);
        WebSettings webSettings = web.getSettings();
        webSettings.setJavaScriptEnabled(true);



    }



}