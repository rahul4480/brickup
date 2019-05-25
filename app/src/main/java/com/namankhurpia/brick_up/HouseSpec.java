package com.namankhurpia.brick_up;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class HouseSpec extends AppCompatActivity {

    EditText length,width,location,min,budget;
    Button confirm;
    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_spec);

        confirm=(Button)findViewById(R.id.confirm_btn);
        length=(EditText)findViewById(R.id.length);
        width=(EditText)findViewById(R.id.width);
        location=(EditText)findViewById(R.id.location);
        min=(EditText)findViewById(R.id.exp);
        budget=(EditText)findViewById(R.id.budget);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String length_s=length.getText().toString().trim();
                String width_s=width.getText().toString().trim();
                String location_s=location.getText().toString().trim();;
                String min_s=min.getText().toString().trim();
                String budget_s=budget.getText().toString().trim();


                mDatabase = FirebaseDatabase.getInstance().getReference();
                mDatabase.child("profile").child("rahul").child("width").setValue(width_s);
                mDatabase.child("profile").child("rahul").child("length").setValue(length_s);
                mDatabase.child("profile").child("rahul").child("location").setValue(location_s);
                mDatabase.child("profile").child("rahul").child("budget").setValue(budget_s);
                mDatabase.child("profile").child("rahul").child("years of experience").setValue(min_s);


                Toast.makeText(getApplicationContext(), "Value saved", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(HouseSpec.this, Relax.class);
                startActivity(i);

            }
        });

    }
}
