package com.minga.android_calc;

import java.util.Locale;

public class Calc {
    private float val_one;
    private boolean process = false;
    private int operation = 0; //0 - еще не назначена, 1- сложение, 2 - вычитание, 3 - умножение, 4- деление


    /**
     * Ввод данных с View
     *
     * @param num
     */
    public String entering(String num, String textNow) {
        if (textNow.equals("0")) {
            if (num.equals(".")) {
                return String.format(Locale.getDefault(), textNow + "%s", num);
            } else {
                return num;
            }
        } else {
            if (process) {
                process = false;
                return num;
            } else if (textNow.contains(".") && num.equals(".")) {
                return textNow;
            } else {
                return String.format(Locale.getDefault(), textNow + "%s", num);
            }
        }
    }

    public String cleanTV() {//очистка данных
        operation = 0;
        process = false;
        return "0";
    }

    public String sum(String textNow) {
        if (operation != 0 && !process) {
            textNow = result(textNow);
        }
        operation = 1;
        val_one = Float.parseFloat(textNow);
        process = true;
        return textNow;
    }

    public String  minus(String textNow) {
        if (operation != 0 && !process) {
            textNow = result(textNow);
        }
        operation = 2;
        val_one = Float.parseFloat(textNow);
        process = true;
        return textNow;
    }

    public String multiplication(String textNow) {
        if (operation != 0 && !process) {
            textNow = result(textNow);
        }
        operation = 3;
        val_one = Float.parseFloat(textNow);
        process = true;
        return textNow;
    }

    public String div(String textNow) {
        if (operation != 0 && !process) {
            textNow = result(textNow);
        }
        operation = 4;
        val_one = Float.parseFloat(textNow);
        process = true;
        return textNow;
    }

    public String result(String textNow) {
        float val_two = Float.parseFloat(textNow);
        process = true;
        switch (operation) {
            case 1:
                operation = 0;
                return floatOrInt(val_one + val_two);
            case 2:
                operation = 0;
                return floatOrInt(val_one - val_two);
            case 3:
                operation = 0;
                return floatOrInt(val_one * val_two);
            case 4:
                operation = 0;
                return floatOrInt(val_one / val_two);
        }
        return textNow;
    }

    private String floatOrInt(float sum) {
        int intSum = (int) sum;
        if (sum % intSum != 0) {
            return String.valueOf(sum);
        } else {
            return String.valueOf(intSum);
        }
    }
}
