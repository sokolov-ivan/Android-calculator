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

        Bundle arguments = getIntent().getExtras();
        String name = arguments.get("print").toString();
        printResult = (TextView)findViewById(R.id.numberField);
        printResult.setText(String.valueOf(name));

    }

}



