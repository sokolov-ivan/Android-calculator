package com.example.android_calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TwoActivity extends AppCompatActivity {
    private TextView printResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        printResult = (TextView) findViewById(R.id.numberFieldTwo);
        String name = "";
        Number number = (Number) getIntent().getParcelableExtra("Number");
        name = number.getVal();
        printResult.setText(name);
    }

}


