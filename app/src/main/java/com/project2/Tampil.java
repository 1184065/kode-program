package com.project2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.project2.R;

public class Tampil extends AppCompatActivity {

    WebView webviewku;
    WebSettings websettingku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil);

        webviewku = (WebView)findViewById(R.id.activity_main_webview);

        websettingku = webviewku.getSettings();

        webviewku.setWebViewClient(new WebViewClient());
        webviewku.loadUrl("https://projectpoltekpos.000webhostapp.com/");

    }

    @Override
    public void onBackPressed() {
        if(webviewku.canGoBack()) {
            webviewku.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
