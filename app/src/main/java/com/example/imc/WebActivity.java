package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {

    private WebView webView;

    public final static String IMC_WEB_WIKIPEDIA = "https://es.wikipedia.org/wiki/%C3%8Dndice_de_masa_corporal";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        this.webView = findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient() {

            //este método se llama cada vez que cambiamos de página
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                Log.d("MIAPP", "Vistando ... " + url);
                view.loadUrl(url);
                return true;
            }
        });
        //webView.loadUrl(IMC_WEB_WIKIPEDIA);
        webView.loadUrl("file:///android_asset/ayuda.html");

    }


}
