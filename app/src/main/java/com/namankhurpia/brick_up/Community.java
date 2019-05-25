package com.namankhurpia.brick_up;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Community extends AppCompatActivity {
ImageView btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community);
btn=(ImageView)findViewById(R.id.community);

btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        Intent i=new Intent(Community.this,PastExperience.class);
        startActivity(i);
    }
});

    }
}
