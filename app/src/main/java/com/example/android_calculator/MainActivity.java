package com.example.android_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText numberField;  //ПОЛЕ ДЛЯ ВВОДА ПЕРВОГО ЧИСЛА
    EditText numberFieldTwo;  //ПОЛЕ ВВОДА ВТОРОГО ЧИСЛА
    public int count = 0;  // счетчик при обработке знаков операций(заготовка) при 1 первое поле и т.д.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (count == 0){
            numberField = findViewById(R.id.numberField);
        }else if (count == 1){
            numberField = findViewById(R.id.numberFieldTwo);
        }


    }

    //обработка нажатия на кнопку цифр и точки
    public void numberClick(View view){
        Button button = (Button)view;
        numberField.append(button.getText());
    }

    //обработка нажатия на delete
    public void deleteClick(View view){
        int len=numberField.getText().length()  ; //получаем длину
        if (len >0){                                   //если без if то ошибка
            numberField.getText().delete(len-1,len);     //удаляем последний элемент
        }
    }


}