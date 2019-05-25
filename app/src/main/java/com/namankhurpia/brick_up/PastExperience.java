package com.namankhurpia.brick_up;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.firebase.client.Firebase;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class PastExperience extends AppCompatActivity {


ImageButton save;
EditText address,cost;
CardView confirm;
    private DatabaseReference mDatabase;
    String address_s,cost_s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past_experience);
        address=(EditText)findViewById(R.id.address);
        cost=(EditText)findViewById(R.id.cost);
        save=(ImageButton)findViewById(R.id.savebutton);

        confirm=(CardView)findViewById(R.id.confirm);


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



        address_s=address.getText().toString().trim();
        cost_s=cost.getText().toString().trim();

                mDatabase = FirebaseDatabase.getInstance().getReference();
                mDatabase.child("contractor").child("naman").child("previous_work").child("address").setValue(address_s);
                mDatabase.child("contractor").child("naman").child("previous_work").child("cost").setValue(cost_s);

                Toast.makeText(getApplicationContext(), "Value saved", Toast.LENGTH_SHORT).show();

            }
        });

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(PastExperience.this,Profile.class);
                startActivity(i);

            }
        });




    }


}
