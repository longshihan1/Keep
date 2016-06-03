package com.news.keep.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.news.keep.R;

public class WebActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_web);
        String url = getIntent().getStringExtra("url");
        System.out.println(url);
        WebView webView = (WebView) findViewById(R.id.webView01);
        webView.loadUrl(url);
    }
}
