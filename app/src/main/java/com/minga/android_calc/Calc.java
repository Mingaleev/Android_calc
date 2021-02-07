package com.minga.android_calc;

import android.widget.TextView;

import java.util.Locale;

public class Calc {
    private TextView tv_calc;
    private int val_one;
    private int val_two;
    private int result;

    public Calc(TextView tv_calc) {
        this.tv_calc = tv_calc;
    }

    public void entering(int num) {
        if (tv_calc.getText().equals("0")) {
            tv_calc.setText(String.format(Locale.getDefault(),"%d", num));
        } else {
            tv_calc.setText(String.format(Locale.getDefault(), tv_calc.getText().toString() +
                    "%d", num));
        }
    }

    public void cleanTV (){
        tv_calc.setText("0");
    }
}
