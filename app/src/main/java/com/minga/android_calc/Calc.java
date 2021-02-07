package com.minga.android_calc;

import android.widget.TextView;

import java.util.Locale;

public class Calc {
    private TextView tv_calc;
    private float val_one;
    private boolean process = false;
    private int operation = 0; //0 - еще не назначена, 1- сложение, 2 - вычитание, 3 - умножение, 4- деление

    public Calc(TextView tv_calc) {
        this.tv_calc = tv_calc;
    }

    public void entering(String num) {
        if (tv_calc.getText().equals("0")) {
            tv_calc.setText(num);
        } else {
            if (process) {
                tv_calc.setText(num);
                process = false;
            } else {
                tv_calc.setText(String.format(Locale.getDefault(), tv_calc.getText().toString() + "%s", num));
            }

        }
    }

    public void cleanTV() {
        tv_calc.setText("0");
        operation = 0;
        process = false;
    }

    public void sum() {
        if (operation != 0) {
            result();
        }
        operation = 1;
        val_one = Float.parseFloat(tv_calc.getText().toString());
        process = true;
    }

    public void minus() {
        if (operation != 0) {
            result();
        }
        operation = 2;
        val_one = Float.parseFloat(tv_calc.getText().toString());
        process = true;
    }

    public void multiplication() {
        if (operation != 0) {
            result();
        }
        operation = 3;
        val_one = Float.parseFloat(tv_calc.getText().toString());
        process = true;
    }

    public void div() {
        if (operation != 0) {
            result();
        }
        operation = 4;
        val_one = Float.parseFloat(tv_calc.getText().toString());
        process = true;
    }

    public void result() {
        float val_two = Float.parseFloat(tv_calc.getText().toString());

        switch (operation) {
            case 1:
                tv_calc.setText(floatOrInt(val_one + val_two));
                break;
            case 2:
                tv_calc.setText(floatOrInt(val_one - val_two));
                break;
            case 3:
                tv_calc.setText(floatOrInt( val_one * val_two));
                break;
            case 4:
                tv_calc.setText(floatOrInt(val_one / val_two));
                break;
        }
        process = true;
        operation = 0;
    }

    private String floatOrInt (float sum) {
        int intSum = (int) sum;
        if (sum%intSum != 0){
            return String.valueOf(sum);
        } else {
            return String.valueOf(intSum);
        }
    }
}
