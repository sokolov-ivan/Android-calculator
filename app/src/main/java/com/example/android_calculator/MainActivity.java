package com.example.android_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText numberField;  //ПОЛЕ ДЛЯ ВВОДА ПЕРВОГО ЧИСЛА
    private Number number;

    private TextView result;
    public int count = 0;  // счетчик при обработке знаков операций(заготовка) при 1 первое поле и т.д.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number = new Number();
        numberField = (EditText) findViewById(R.id.numberField);
        result = (TextView) findViewById(R.id.result);

        findViewById(R.id.button_test).setOnClickListener(v -> {
            double value = Double.parseDouble(numberField.getText().toString());
            number.setNumber(value);
            result.setText(String.valueOf(number.getNumber()));
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


//
//public class MainActivity extends AppCompatActivity {
//    private EditText numberField;  //ПОЛЕ ДЛЯ ВВОДА ПЕРВОГО ЧИСЛА
//
//    private TextView result;
//    public int count = 0;  // счетчик при обработке знаков операций(заготовка) при 1 первое поле и т.д.
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        numberField = (EditText) findViewById(R.id.numberField);
//        result = (TextView) findViewById(R.id.result);
//
//        findViewById(R.id.button_test).setOnClickListener(v -> {
//            int value = Integer.parseInt(numberField.getText().toString());
//            result.setText(String.valueOf(value));
//        });
//
//
//        result.setText(numberField.getText().toString());
//
//
//    }
//
//    //обработка нажатия на кнопку цифр и точки
//    public void numberClick(View view) {
//        Button button = (Button) view;
//        numberField.append(button.getText());
//    }
//
//    //обработка нажатия на delete
//    public void deleteClick(View view) {
//        int len = numberField.getText().length(); //получаем длину
//        if (len > 0) {                                   //если без if то ошибка
//            numberField.getText().delete(len - 1, len);     //удаляем последний элемент
//        }
//    }
//
//
//}






