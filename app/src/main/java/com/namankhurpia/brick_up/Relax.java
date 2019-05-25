package com.namankhurpia.brick_up;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Relax extends AppCompatActivity {

    ImageButton relax;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relax);
        relax=(ImageButton)findViewById(R.id.relax);

        relax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Relax.this,Comparison.class);
                startActivity(i);

            }
        });
    }
}
