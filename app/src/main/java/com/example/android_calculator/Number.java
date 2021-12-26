package com.example.android_calculator;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.EditText;

public class Number implements Parcelable {
    private String val;

    public static final Creator<Number> CREATOR = new Creator<Number>() {
        @Override
        public Number createFromParcel(Parcel source) {
            String val = source.readString();
            return new Number(val);
        }

        @Override
        public Number[] newArray(int size) {
            return new Number[size];
        }
    };

    public Number(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(val);
    }

}


