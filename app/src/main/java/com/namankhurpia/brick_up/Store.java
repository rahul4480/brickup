package com.namankhurpia.brick_up;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Calendar;

public class Store extends AppCompatActivity {
    private Spinner spinner1;
    CardView card;
    DatePicker date;

    CardView confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);
        confirm=(CardView)findViewById(R.id.confirm);
date=(DatePicker)findViewById(R.id.date);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Payment will be carried out", Toast.LENGTH_SHORT).show();

            }
        });

        addListenerOnButton();
        addListenerOnSpinnerItemSelection();}

    public void addListenerOnSpinnerItemSelection() {
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());
    }

    public void addListenerOnButton() {

        spinner1 = (Spinner) findViewById(R.id.spinner1);
        card = (CardView)findViewById(R.id.storecardview);

        card.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(Store.this,
                        "OnClickListener : " +
                                "\nSpinner 1 : "+ String.valueOf(spinner1.getSelectedItem()),
                        Toast.LENGTH_SHORT).show();
            }

        });



        Calendar cal=Calendar.getInstance();
        date.init(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH), new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Toast.makeText(getApplicationContext(), date.getDayOfMonth()+"-"+date.getMonth()+"-"+date.getYear(), Toast.LENGTH_SHORT).show();

            }
        });

    }


}
