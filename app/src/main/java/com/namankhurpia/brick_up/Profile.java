package com.namankhurpia.brick_up;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.Firebase;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Profile extends AppCompatActivity {

    ImageButton home_btn;
    EditText place;
    ImageButton place_bid;
    TextView text;

    private Firebase mrootref;
    String text_s="null";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        home_btn=(ImageButton)findViewById(R.id.view_home);
        place=(EditText)findViewById(R.id.bidvalue);
        place_bid=(ImageButton)findViewById(R.id.placebid);
        text=(TextView)findViewById(R.id.fetchtext);

        final DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference();
        DatabaseReference rf = rootRef.child("profile").child("rahul");
        rf.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Toast.makeText(getApplicationContext(), "Value fetched", Toast.LENGTH_SHORT).show();


            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });





        home_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Profile.this,web_view.class);
                startActivity(i);

            }
        });

        place_bid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Value pushed", Toast.LENGTH_SHORT).show();

            }
        });




    }
}
