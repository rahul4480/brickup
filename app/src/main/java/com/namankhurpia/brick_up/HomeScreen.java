package com.namankhurpia.brick_up;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class HomeScreen extends AppCompatActivity {
ImageView open,close,home_specs,view_bid,store,govt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        open = (ImageView)findViewById(R.id.open);
        close = (ImageView)findViewById(R.id.close);
        home_specs=(ImageView)findViewById(R.id.home_specs);
        view_bid=(ImageView)findViewById(R.id.view_bid);
store=(ImageView)findViewById(R.id.store);
govt=(ImageView)findViewById(R.id.govt);

        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeScreen.this, HouseSpec.class);
                startActivity(i);
            }
        });
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(HomeScreen.this,Close.class);
                startActivity(i);
            }
        });

        home_specs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(HomeScreen.this,HouseSpec.class);
                startActivity(i);

            }
        });

        view_bid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(HomeScreen.this,Comparison.class);
                startActivity(i);
            }
        });

        store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(HomeScreen.this,Store.class);
                startActivity(i);
            }
        });

        govt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("http://www.tenders.tn.gov.in/innerpage.asp?choice=ot4");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);


            }
        });


    }
}
