package com.example.android_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText numberField;
    private Number number;

    private TextView result;
//    private final static String keyNumber = "Number";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberField = (EditText) findViewById(R.id.numberField);
        result = (TextView) findViewById(R.id.result);
        Number number = new Number(numberField.getText().toString());   //

        findViewById(R.id.button_test).setOnClickListener(v -> {
            String value = numberField.getText().toString();          //
            number.setVal(value);
            result.setText(String.valueOf(number.getVal()));
        });
        findViewById(R.id.button_two_activity).setOnClickListener(v -> {
            Intent intent = new Intent(this, TwoActivity.class);
            intent.putExtra("Number", number);   //Number.class.getSimpleName()  - настояшие имя файла
            startActivity(intent);
        });
    }
    //обработка нажатия на кнопку цифр и точки
    public void numberClick(View view) {
        Button button = (Button) view;
        numberField.append(button.getText());
    }
    //обработка нажатия на delete
    public void deleteClick(View view) {
        int len = numberField.getText().length(); //получаем длину
        if (len > 0) {                                   //если без if то ошибка
            numberField.getText().delete(len - 1, len);     //удаляем последний элемент
        }
    }
}






