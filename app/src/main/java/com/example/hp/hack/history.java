package com.example.hp.hack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class history extends AppCompatActivity {

    private WebView webViewrec;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        getSupportActionBar().hide();

        webViewrec = (WebView) findViewById(R.id.webViewrec);
        webViewrec.getSettings().setJavaScriptEnabled(true);
        webViewrec.setWebViewClient(new WebViewClient());
        webViewrec.loadUrl("http://www.mewj.tk/ais/graphs");

    }
    private class Callback extends WebViewClient{  //HERE IS THE MAIN CHANGE.

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return (false);
        }

    }
}
