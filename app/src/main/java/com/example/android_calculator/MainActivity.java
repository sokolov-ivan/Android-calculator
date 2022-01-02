package com.example.android_calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {
    private EditText numberField;
    private TextView result;
    private String value;
    Button numberOneButton;
    Button numberTwoButton;
    Button numberThreeButton;
    Button numberFourButton;
    Button numberFiveButton;
    Button numberSixButton;
    Button numberSevenButton;
    Button numberEightButton;
    Button numberNineButton;
    Button numberZeroButton;
    Button point_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberField = (EditText) findViewById(R.id.number_field_edit_text);
        result = (TextView) findViewById(R.id.result_text_view);
        Number number = new Number(numberField.getText().toString());   //
        numberOneButton = (Button) findViewById(R.id.number_one_button);
        numberTwoButton = (Button) findViewById(R.id.number_two_button);
        numberThreeButton = (Button) findViewById(R.id.number_three_button);
        numberFourButton = (Button) findViewById(R.id.number_four_button);
        numberFiveButton = (Button) findViewById(R.id.number_five_button);
        numberSixButton = (Button) findViewById(R.id.number_six_button);
        numberSevenButton = (Button) findViewById(R.id.number_seven_button);
        numberEightButton = (Button) findViewById(R.id.number_eight_button);
        numberNineButton = (Button) findViewById(R.id.number_nine_button);
        numberZeroButton = (Button) findViewById(R.id.number_zero_button);
        point_button = (Button) findViewById(R.id.point_button);
        OnClickListener oMyButton = new OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.number_one_button:
                        numberField.append(numberOneButton.getText());
                        break;
                    case R.id.number_two_button:
                        numberField.append(numberTwoButton.getText());
                        break;
                    case R.id.number_three_button:
                        numberField.append(numberThreeButton.getText());
                        break;
                    case R.id.number_four_button:
                        numberField.append(numberFourButton.getText());
                        break;
                    case R.id.number_five_button:
                        numberField.append(numberFiveButton.getText());
                        break;
                    case R.id.number_six_button:
                        numberField.append(numberSixButton.getText());
                        break;
                    case R.id.number_seven_button:
                        numberField.append(numberSevenButton.getText());
                        break;
                    case R.id.number_eight_button:
                        numberField.append(numberEightButton.getText());
                        break;
                    case R.id.number_nine_button:
                        numberField.append(numberNineButton.getText());
                        break;
                    case R.id.number_zero_button:
                        numberField.append(numberZeroButton.getText());
                        break;
                    case R.id.point_button:
                        numberField.append(point_button.getText());
                        break;
                }
            }
        };
        numberOneButton.setOnClickListener(oMyButton);
        numberTwoButton.setOnClickListener(oMyButton);
        numberThreeButton.setOnClickListener(oMyButton);
        numberFourButton.setOnClickListener(oMyButton);
        numberFiveButton.setOnClickListener(oMyButton);
        numberSixButton.setOnClickListener(oMyButton);
        numberSevenButton.setOnClickListener(oMyButton);
        numberEightButton.setOnClickListener(oMyButton);
        numberNineButton.setOnClickListener(oMyButton);
        numberZeroButton.setOnClickListener(oMyButton);
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

