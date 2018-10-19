package com.jhonatasrm.example_picker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openDate(View view) {
        DatePicker dp = new DatePicker();
        dp.show(getSupportFragmentManager(), "datePicker");
    }

    public void openTime(View view) {
        TimePicker tp  = new TimePicker();
        tp.show(getSupportFragmentManager(), "timePicker");
    }
}