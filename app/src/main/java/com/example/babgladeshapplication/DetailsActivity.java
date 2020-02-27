package com.example.babgladeshapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private  TextView textView1;
    private WebView webView;
    private Bundle extra;
    private Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        mContext= DetailsActivity.this;

        webView=findViewById(R.id.simpleWebViewId);
        // fff
        extra=getIntent().getExtras();

        textView1=findViewById(R.id.TextId);

        Bundle bundle= getIntent().getExtras();

        if (bundle!=null){

            textView1.setText(bundle.getString("titles"));

        }

         if (extra!=null){

            String data= extra.getString("details");
             String url = "file:///android_asset/"+data+".html";
             webView.loadUrl(url);


            WebSettings webSettings = webView.getSettings();
            webSettings.setBuiltInZoomControls(true);
            webSettings.setDisplayZoomControls(true);
            webSettings.setJavaScriptEnabled(true);

        }



    }
}
