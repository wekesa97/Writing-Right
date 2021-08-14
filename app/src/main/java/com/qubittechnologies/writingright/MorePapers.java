package com.qubittechnologies.writingright;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MorePapers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_papers);
        //getActionBar().setTitle(Html.fromHtml("<font color=\"#0099cc\">"));
        WebView webView = (WebView)findViewById(R.id.webview);
        WebSettings webSettings= webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl("https://cyberleninka.org");

    }
}
