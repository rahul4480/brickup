package com.namankhurpia.brick_up;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

public class web_view extends AppCompatActivity {

    WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);


        String url="https://www.roomsketcher.com/wp-content/uploads/2015/12/RoomSketcher-3D-Floor-Plan_800x600.jpg";
        mWebView =(WebView)findViewById(R.id.webview);
        mWebView.getSettings().setJavaScriptEnabled(true);
        Toast.makeText(getApplicationContext(), "image may take time to load",Toast.LENGTH_LONG).show();
        mWebView.loadUrl(url);


    }
}
