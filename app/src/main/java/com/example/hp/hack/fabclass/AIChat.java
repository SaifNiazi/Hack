package com.example.hp.hack.fabclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.hp.hack.R;

public class AIChat extends AppCompatActivity {

    private WebView webView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aichat);
        getSupportActionBar().hide();

        webView = (WebView) findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        //webView.getSettings().setPluginsEnabled(true);
        webView.getSettings().setAppCacheEnabled(false);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);

        String data = "                    <script type=\"text/javascript\">\n" +
                "\t\tvar headID = document.getElementsByTagName(\"head\")[0];\n" +
                "\t\tvar newCss = document.createElement('link');\n" +
                "\t\tnewCss.rel = 'stylesheet';\n" +
                "\t\tnewCss.type = 'text/css';\n" +
                "\t\twindow._botUsername = '114021';\n" +
                "\t\twindow._botName = 'Venali';\n" +
                "\t\tnewCss.href = \"http://rebot.me/assets/css/bot.css\";\n" +
                "\t\tvar newScript = document.createElement('script');\n" +
                "\t\tnewScript.src = \"http://rebot.me/assets/js/bot.js\";\n" +
                "\t\tnewScript.type = 'text/javascript';\n" +
                "\t\theadID.appendChild(newScript);\n" +
                "\t\theadID.appendChild(newCss);\n" +
                "\t\t</script>\n" +
                "                ";

        webView.loadData(data, "text/html", "UTF-8");
    }


    private class Callback extends WebViewClient{  //HERE IS THE MAIN CHANGE.

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return (false);
        }

    }
}
