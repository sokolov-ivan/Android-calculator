package com.example.android_calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {
    private EditText numberField;
    private TextView result;
    private String value;
    Button one_button;
    Button two_button;
    Button three_button;
    Button four_button;
    Button five_button;
    Button six_button;
    Button seven_button;
    Button eight_button;
    Button nine_button;
    Button zero_button;
    Button point_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberField = (EditText) findViewById(R.id.number_field_edit_text);
        result = (TextView) findViewById(R.id.result);
        Number number = new Number(numberField.getText().toString());   //
        one_button = (Button) findViewById(R.id.one_button);
        two_button = (Button) findViewById(R.id.two_button);
        three_button = (Button) findViewById(R.id.three_button);
        four_button = (Button) findViewById(R.id.four_button);
        five_button = (Button) findViewById(R.id.five_button);
        six_button = (Button) findViewById(R.id.six_button);
        seven_button = (Button) findViewById(R.id.seven_button);
        eight_button = (Button) findViewById(R.id.eight_button);
        nine_button = (Button) findViewById(R.id.nine_button);
        zero_button = (Button) findViewById(R.id.zero_button);
        point_button = (Button) findViewById(R.id.point_button);
        OnClickListener oMyButton = new OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.one_button:
                        numberField.append(one_button.getText());
                        break;
                    case R.id.two_button:
                        numberField.append(two_button.getText());
                        break;
                    case R.id.three_button:
                        numberField.append(three_button.getText());
                        break;
                    case R.id.four_button:
                        numberField.append(four_button.getText());
                        break;
                    case R.id.five_button:
                        numberField.append(five_button.getText());
                        break;
                    case R.id.six_button:
                        numberField.append(six_button.getText());
                        break;
                    case R.id.seven_button:
                        numberField.append(seven_button.getText());
                        break;
                    case R.id.eight_button:
                        numberField.append(eight_button.getText());
                        break;
                    case R.id.nine_button:
                        numberField.append(nine_button.getText());
                        break;
                    case R.id.zero_button:
                        numberField.append(zero_button.getText());
                        break;
                    case R.id.point_button:
                        numberField.append(point_button.getText());
                        break;
                }
            }
        };
        one_button.setOnClickListener(oMyButton);
        two_button.setOnClickListener(oMyButton);
        three_button.setOnClickListener(oMyButton);
        four_button.setOnClickListener(oMyButton);
        five_button.setOnClickListener(oMyButton);
        six_button.setOnClickListener(oMyButton);
        seven_button.setOnClickListener(oMyButton);
        eight_button.setOnClickListener(oMyButton);
        nine_button.setOnClickListener(oMyButton);
        zero_button.setOnClickListener(oMyButton);
        point_button.setOnClickListener(oMyButton);

        if (savedInstanceState != null && savedInstanceState.containsKey("key")) {
            value = savedInstanceState.getString("key");
            result.setText(value);
            number.setVal(value);
        }
        findViewById(R.id.test_button).setOnClickListener(v -> {
            value = numberField.getText().toString();          //
            number.setVal(value);
            result.setText(value);
        });
        findViewById(R.id.two_activity_button).setOnClickListener(v -> {
            Intent intent = new Intent(this, TwoActivity.class);
            intent.putExtra("Number", number);   //Number.class.getSimpleName()  - настояшие имя файла
            startActivity(intent);
        });
        findViewById(R.id.delete_Click_button).setOnClickListener(v -> {
            int len = numberField.getText().length(); //получаем длину
            if (len > 0) {                                   //если без if то ошибка
                numberField.getText().delete(len - 1, len);     //удаляем последний элемент
            }
        });
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("key", value);
    }
}

