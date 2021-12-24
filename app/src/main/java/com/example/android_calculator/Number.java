package com.example.android_calculator;

import android.widget.EditText;

public class Number {
    private double val;
    public Number() {
        val = 0;
    }

    public double getNumber() {
        return val;
    }
    public void setNumber(double a) {
        val = a;
    }
}
